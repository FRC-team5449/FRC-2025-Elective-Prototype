# FRC Elective Programming Course Syllabus
## 1 课程描述

FRC研修课程序组将会教授FRC程序以及电路的入门内容，在结束本课程后，学生应该掌握独自编写基本机器人程序、调试控制器参数、搜寻排除程序错误的能力。我们的课程将从由Java语言编写的简单程序出发，从语言基础到计算机视觉，覆盖绝大多数的FRC机器人相关知识。

我们期待你能在这门课中收获良多，但是这也需要你在这门功课上付出一定的努力，想要学好这门课并在FIRST系列相关的机器人竞赛中大展身手吗？你需要遵循以下原则：

1. Talk is cheap, show me the code
	计算机科学是一门科学，但更是一门工程，我们希望你不仅仅总是停留在那些理论的、设想的环境中。相反，你需要尽可能自己一个人专注在程序中，实在地通过代码来实现你脑中的构想，并为这些可能存在bug的程序进行测试，直到在机器人上成功运行时，才能宣告成功！所以，在本门课中，我们也会安排Lab(参照评分体系)来帮助大家真正掌握程序。

2. Code alone, but work together
	FRC从来不是一个人的单打独斗，而是在大家的配合与交流中进行的。请翻看所有强队的github repository，你会发现无一例外，每个队伍的代码都是通过合作完成的。所以在本门课中，我们期待你能与其他组员一起，各司其职，遵循规则，一通协力完成我们的各类project，不要成为一个free rider哦！除此之外，编码的时候还是尽量自己一个人吧，不要被大家热烈的讨论和称赞中冲昏头脑😄，程序员的逻辑与效率将会是你制胜的法宝。

3. Problems and obstacles? You're on the track to success!
	FRC编程对于大多数的高中生来说都充满挑战，相信我，无论对于强队弱队都是这样。可能20人的程序组中最后只有2-3人能够参与正赛机器人程序的编写中，但是我们也将尽可能帮助你成为独当一面的程序员，通过完善课程、课下答疑帮助你度过难关。如果你有时不理解课堂内容，不要担心，这是正常现象，请及时咨询我们；同时，你需要更多的练习以及思考来克服障碍。当你不是一帆风顺之时，请相信，你已经走在了正确的路上！

## 2 评分体系

### 2.1 分级制度

为了鼓励练习，FRC研修课程序组把程序知识分为四个等级，在完成一定的课时教学后，你需要完成此等级的Final Project，并在程序教学组的检查后获得晋级。学期末结课时，总评分数将会根据下表对应当前级别结算。

+ 等级一：面向对象Java基础 (Java Basics)   80 分 B
+ 等级二：开环控制 (Open-Loop Control)     85 分 A
+ 等级三：闭环控制 (Closed-Loop Control)   93 分 A+
+ 等级四：计算机视觉 (Computer Vision)      100分 A+

每周四研修课的安排为 Lecture + Lab，可能为 1节Lecture + 2节Lab 或 2节Lecture + 1节Lab。Lecture专注于知识点讲解以及过往代码分析。Lab将会公布项目代码，以代码补全或者小游戏形式完成，Lecture与Lab的出勤率不计入最终成绩，但是会在每节课进行记录。同时，我们鼓励大家全勤参与，如果最终没能完成Final Project晋级，可以使用出勤次数以及完成Lab次数抵消，获得GPA。能够抵消某个Final Project的出勤率没有具体界定，需要结合上课积极度和表现进行考量，因此完成Final Project仍然是获得高分的首选。
### 2.2 Final Project

Final Project 并不是课下作业(虽然你可以课下完成)，而是在Lab时间完成的任务。对于Final Project，你可以在网上搜索相关资料、咨询他人或者使用AI生成代码，但是请不要完全依赖这些工具或资料，而是在使用工具后，尝试完全理解代码。Final Project设立的目的并不是为了纯粹的评分，而是为了给你提供更多上手实践的机会，以此提升自己快速学习并使用工具的能力，所以认真完成Final Project提升你对程序设计的理解。各等级Final Project如下所示，所有Final Project的具体形式将会在课堂讲解并公布技术文档。

+ 等级一：面向对象Java基础 (Java Basics)  *Images*
+ 等级二：开环控制 (Open-Loop Control)   *TankDrive Implementation*
+ 等级三：闭环控制 (Closed-Loop Control) *Real/Simulated Arm & Elevator Control*
+ 等级四：计算机视觉 (Computer Vision)    *LimeLight/PhotonVision*

## 3 相关资源

1.[Java基础](https://www.runoob.com/java/java-tutorial.html) 需要具有一定的编程基础才能自主阅读
2.[WPILib官方文档](https://docs.wpilib.org/en/stable/index.html) 官方API及其配套软件讲解，必读资料
3.[CTRE Phoenix6文档](https://v6.docs.ctr-electronics.com/en/stable/) Kraken及Falcon软件API供应商，必读资料
4.[REV ION文档](https://docs.revrobotics.com/docs/rev-ion)  NEO电机及部分传感器API，非必读
5.[Path Planner文档](https://pathplanner.dev/home.html) 最强自动API，必读资料
6.[Choreo文档](https://sleipnirgroup.github.io/Choreo/) 自动路径画图及其API
6.[Limelight文档](https://docs.limelightvision.io/docs/docs-limelight/getting-started/summary) 物体识别及Apriltag 必读资料
7.[Photon Vision文档](https://docs.photonvision.org/en/latest/) Limelight平替
8.[Advantage Kit文档](https://github.com/Mechanical-Advantage/AdvantageKit?tab=readme-ov-file) Replay及Simulator，FRC革命性API及软件，必读资料

## Table of Contents
1. [Java Basics](Lecture1/Lesson1_Intro_to_Java.md)
2. [Classes and Objects](Lecture2/Lesson2_Class_And_Objects.md)
3. [Inheritance and Interface](Lecture3/Lesson3_Inheritance_And_Interface.md)
