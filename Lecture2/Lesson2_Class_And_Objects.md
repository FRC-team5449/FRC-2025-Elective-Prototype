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
  //so we can let our user customize the whistle by passing different whistles.
  void blowWhistle(String whistleSound) {
    System.out.println(whistleSound);
  }
  //Since we have no value to return, we write void here to represent None

  //Or we can simply return some of our attributes
  int getPrice() {
    return price;
  }

  //Try to writr more methods!
  //...
}
```

Now, we almost reach the destination, but there is a serious problem. The purpose of defining a class is to help us build/initialize objects, but there isn't any place where we can assign values to the **attributes** we wrote in the class. Hence, we need a tool called **constructor** to help us initialize objects.

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

After you complete the constructor, you can now try to initialize your "first" object in Java. (Why is there quotation mark around first? 🤔️)

Write main method in your class to as the entrance of your program.

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
    //toyota is the object/initialization of class Car

    //So the format to initialize an object should be
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
    //Initialize
    String a = new String("123");
    //Use some methods of String
    int len = a.length();
  }
}
```

Think a liitle bit: compare the length() of String and [length of array](/Lecture1/Lesson1_Intro_to_Java.md#Array), why are there brackets following that of String? 

## Reference in Java

## Magic of keyword *this*

In Java, *this* is a very crucial keyword that you should always remind yourself to use.

*this* represents the current object! There are different situations you should use it!

1. The name of parameters is same as that of attributes
2. Embed the existing constructor into a new one
3. Pass the current object as a parameter 

**Situation 1:**
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

## I was born earlier than all of you! -- *static*
