# Lesson2 Objects and Classes

**Reminder: Please review the last lesson first!**

![meme](/Lecture2/images/meme.png)

Now! Get ready to learn the most important class!

## Introduction

Before talking about the computer, let's think about the real world. Semantically, the word "object" can be referred to anything around the world, which is that everything could be an "object". For example, I would say *Tom* is an object, and *your family's car* is also an object.

How about the class? We might think about the word "classify" or "classification", so the "class" is very same as the category. Use example above, *Tom* is an object, and the class of *Tom* is apparently *person*.

Thus, there is an old saying in computer science, "Class is the abstraction of objects".

## Class in Java

Let's turn back to the computer science. For example, if I want to represent a car in the program, what things should I do?
First, let's define the class *Car*!

```Java
public class Car {
  //Reminder: Captitalize the name of your class!! 👆
}
```

Besides, we all know for a car, it must have some related parameters, such as **brand**, **price**, **color**, and **power**.

Notice that we are representing *car*, but not any specific car in the world since we are designing a **class(abstraction)**. Then let's write these **attributes**, or the properties of an element, in our class.

```Java
public class Car {
  int price;
  String brand;
  String color;
  double power;
}
```

It's not enough! For a car, we can drive it or blow the whistle, which are the actions of a car. How can we define the actions of a class. The answer is **function**, or **method**. Let's see how can we write a method in Java.

```Java
public class Car {
  int price;
  String brand;
  String color;
  double power;

  //To define the function, you must follow this format
  T name(V v, S s) {
    //  T: type of value you will return
    //  V, S: type of parameter
    //  v, s name of parameter
  }

  //For example, we know every car has different whistles,
  //so we can let our user customize the whistle by passing
  //different whistles.
  void blowWhistle(String whistleSound) {
    System.out.println(whistleSound);
  }
  //Since we have no value to return, we write void here to represent None

  //Or we can simply return some of our attributes
  int getPrice() {
    return price;
  }

  //Try to write more methods!
  //...
}
```

Now, we almost reach the destination, but there is a serious problem. The purpose of defining a class is to help us build/instantiate objects, but there isn't any place where we can assign values to the **attributes** we wrote in the class. Hence, we need a tool called **constructor** to help us instantiate objects.

```Java
public class Car {
  int price;
  String brand;
  String color;
  double power;

  //To define a constructor, it's very similar as method.
  Car(int p, String b, String c, double po) {
    price = p;
    brand = b;
    color = c;
    power = po;
  }

  //There could be multiple constructors in one class
  //once they have different parameters
  Car(int p, double po) {
    price = p;
    power = po;
    brand = "";
    color = "";
  }

  //Try to write more constuctors!
  //...

  void blowWhistle(String whistleSound) {
    System.out.println(whistleSound);
  }

  int getPrice() {
    return price;
  }
}
```

## Introduction to Objects

After you complete the constructor, you can now try to instantiate your "first" object in Java. (Why is there quotation mark around first? 🤔️)

Write main method in your class as the entrance of your program.

```Java
public class Car {
  int price;
  String brand;
  String color;
  double power;

  Car(int p, String b, String c, double po) {
    price = p;
    brand = b;
    color = c;
    power = po;
  }

  Car(int p, double po) {
    price = p;
    power = po;
    brand = "";
    color = "";
  }

  void blowWhistle(String whistleSound) {
    System.out.println(whistleSound);
  }

  int getPrice() {
    return price;
  }

  public static void main(String[] args) {
    Car toyota = new Car(10,1000);
    //toyota is the object/instance of class Car

    //So the format to instantiate an object should be
    ClassName objectName = new Constructor(parameters...);

    System.out.println(toyota.getPrice());
    toyota.blowWhistle("Di Di Di~~");
  }
}
```
Since we know the the first letter of a class name must be capitalized, *String* is also a class, and all of these *String*s are actually objects.

To prove this, let's try to compile the codes follwing.

```Java
public class Car {
  // ...

  public static void main(String[] args) {
    //instantiate
    String a = new String("123");
    //Use some methods of String
    int len = a.length();
  }
}
```

Think a liitle bit: compare the length() of String and [length of array](/Lecture1/Lesson1_Intro_to_Java.md#Array), why are there brackets following that of String? 

## Reference in Java

**Java is very different from C++ since there is no pointer in Java**! Instead, we often mention reference in Java.

**Definition:** 

1. Reference variable is used to point object/values.

2. Classes, interfaces, arrays, enumerations, and, annotations are reference types in Java. Reference variables hold the objects/values of reference types in Java.

3. Reference variable can also store null value. By default, if no object is passed to a reference variable then it will store a null value.

4. You can access object members using a reference variable using dot syntax.

Let's explain the sentences above one by one!

+ Reference variable is used to point object/values. 
  
  Basically, in the beginner level, we can interpret the memory of computers as two types of memory. The first is **local memory**, and the second one is **allocated memory**. See the photo below. And more will be explained later.
  
  ![blackSpace](/Lecture2/images/blank.png)

+ Reference variable can also store null value. By default, if no object is passed to a reference variable then it will store a null value.
  
  Before talking about the class, let's see how will memory be changed when we do something more fundamental. For example, if I **int p = 1**. There will be a variable called **p** appearing in the local memory with a value 1.

  ![p=1](/Lecture2/images/p1.png)

  Then **int q = p**. q will also appear as p.

  ![q=p](/Lecture2/images/p1q1.png)

  Finally, let's try **q = 0**. Apparently, the value of p will be different from that of q. However, *something will be different when we do operations on classes, which is one of the types of reference variable*.

  ![q!=p](/Lecture2/images/p1q0.png)

  Here, let's write a super simple class for us to comprehend the reference.

  ```Java
  public class TestObj {
    int num;
    TestObj(int a) {
      num = a;
    }
  }
  ```

  First, let's instantiate an object called p, by which **TestObj p = new TestObj(1)**.

  In the computer's memory, there will be a variable called p in the local memory, and it's pointing to a memory area allocated in the allocated memory with the type **TestObj**, where the attribute *num* is also stored in it.

  ![testobj1](/Lecture2/images/TestObj1.png)

  You might wonder how this "point to" works, maybe we can print out p and see the result.

  ```Java
  public class TestObj {
    int num;
    TestObj(int a) {
     num = a;
    }

    public static void main(String[] args) {
      TestObj p = new TestObj(1);
      System.out.println(p);
    }
  }
  ```
  The result is **TestObj@7ad041f3**. Actually, 7ad041f3 is the address of the object we've created before. p only stores the address of the object, and all of the attributes are stored in the allocated memory.

  With these background information, let's try to do some operations similar as we've done on the **int** type, and see what will happen!

  ```Java
  public class TestObj {
    int num;
    TestObj(int a) {
      num = a;
    }

    public static void main(String[] args) {
      TestObj p = new TestObj(1);
      TestObj q = p;
      q.num = 0;
      System.out.println(p.num);
      System.out.println(q.num);
    }
  }
  ```
  Oh no! We found that the result is 0, 0; but we expect the result should be 1, 0 as the previous one. **Think for a while about the reason why the result is different from our expectation.**

  That's because when we do **TestObj q = p;** there will be a variable called q also pointing to the object that p is pointing to.

  ![p==q](/Lecture2/images/p==q.png)

  Then we change the num of q, but it is actually the num of object that q is pointing to, which is the same object that p is pointing to. Hence, the result is 0, 0.

  ![pnum=qnum](/Lecture2/images/pnum=qnum.png)

  Test more!

+ Reference variable can also store null value. By default, if no object is passed to a reference variable then it will store a null value.
  
  When we declare a object, such as **TestObj p** with out instantiating, then p is null. **null** means that the variable is pointing to nothing in the allocated memory.

  ![nothing](/Lecture2/images/nothing.png)

+ You can access object members using a reference variable using dot syntax.

  This is already explained by the previous example. **p.num** is the dot syntax that we can access object member(attribute).



## Magic of keyword *this*

In Java, *this* is a very crucial keyword that you should always remind yourself to use.

*this* represents the current object! There are different situations you should use it!

1. The name of parameters is same as that of attributes
   
2. Embed the existing constructor into a new one
   
3. Pass the current object as a parameter 

**Situation 1:**
+ The name of parameters is same as that of attributes
```Java
public class Car {
  int price;
  //...
  void changePrice(int price) {
    //Here, the parameter has the same name as attribute
    //If we simply write as this, what happened?
    price = price;

    //So, we should indicate the attribute by using keyword this
    //since this represents the current object
    //Thus, this.price represents the variable price of the current object
    this.price = price;
  }
}
```

**Situation 2**
+ Embed the existing constructor into a new one
```Java
public class Car {
  //...
  //Remind two constructors we wrote above
  Car(int p, String b, String c, double po) {
    price = p;
    brand = b;
    color = c;
    power = po;
  }

  Car(int p, double po) {
    price = p;
    power = po;
    brand = "";
    color = "";
  }
  
  //We can simplify the second one as
  Car(int p, double po) {
    this(p, "", "", po);
  }
  //By using the existing constructors!
}
```

**Situation 3**
+ Pass the current object as a parameter

Let's assume there is a car store that sales second-hand car. Hence, we must recive a *Car* object to calculate some parameters.
```Java
public class CarStore {
  Car car;

  CarStore(Car c) {
    car = c;
  }

  double getPriceInStore() {
    return car.getPrice() * 0.8;
  }
}
```

Then, we might think it's more convenient to have the getPriceInStore() method in the car class. So we create the same method in the class *Car*. However, we don't know the exact process of calculation since it varies every day.

```Java
public class Car {
  //...
  double getPriceInStore() {
    return new CarStore(this).getPriceInStore();
  }
  //Why should we use this here?
  //Since the constructor of CarStore needs a instance/object of Car
  //We pass the current object to get that price
}
```

## Hold your "secret" with *private* and *public*

Are you still wondering the *public* infront of keyword class? Why should we add this?

**Public**: If a class is declared as public then we can access that class from anywhere.

**Private**: If a variable or methods or constructor is declared as private then we can access them only from within the class i.e from outside the class we can’t access them.

And this modifier could be added to both of function and attribute. Thus, the right class should be as follow:

```Java
public class Car {
  private int price;
  private String brand;
  private String color;
  private double power;

  public Car(int p, String b, String c, double po) {
    price = p;
    brand = b;
    color = c;
    power = po;
  }

  public Car(int p, double po) {
    price = p;
    power = po;
    brand = "";
    color = "";
  }

  public void blowWhistle(String whistleSound) {
    System.out.println(whistleSound);
  }

  public int getPrice() {
    return price;
  }

  public static void main(String[] args) {
    Car toyota = new Car(10,1000);
    //toyota is the object/instance of class Car

    //So the format to instantiate an object should be
    ClassName objectName = new Constructor(parameters...);

    System.out.println(toyota.getPrice());
    toyota.blowWhistle("Di Di Di~~");
  }
}
```

Traditionally, we will add private in front of attributes and public in front of functions.

## I was born earlier than all of you! -- *static*

There are actually four usages of *static* in Java, we will introduce the first two to you.

If the variable or method is modified by *static*, it will only depend on class but not the class. How can we interpret that?

```Java
public class Car {
  public static int count = 0;

  public Car() {
    count++;
  }

  public static void main(String[] args) {
    Car a = new Car();
    Car b = new Car();
    Car c = new Car();
    System.out.println(a.count);
  }
}
```

The result is **3**!! Why? That's becuase the variable count is depending on the class, so whatever object we create, count will be incremented since all of them are belonged to the class.

In FRC programming, we often use static to modify some helper functions that could be used in most cases, such as Util class.

```Java
public class MathUtil {
  /**
  * Returns value clamped between low and high boundaries.
  *
  * @param value Value to clamp.
  * @param low The lower boundary to which to clamp value.
  * @param high The higher boundary to which to clamp value.
  * @return The clamped value.
  */
  public static double clamp(double value, double low, double high) {
    return Math.max(low, Math.min(value, high));
  }
}
```

Also, notice that the static function could only use the static variable in the class, and static variable could be used in both static and non-static functions.

```Java
public class StaticTest {
  private static int count1 = 0;
  private int count2 = 0;

  public static void plusCount() {
    count1++;
    //count2++   If you uncomment this, what will happen?
  }

  public void plusCount() {
    count1++;
    count2++;
  }
}
```
