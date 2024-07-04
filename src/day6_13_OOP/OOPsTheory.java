package day6_13_OOP;

/*
A class is a blueprint for creating objects and class -is a collection of variables and methods     
Object- Object is an instance of a class Exp: Class - Fruits, Object-Apple, Banana, Mango 
Method - Block of code which contain logic

Four pillars of Object-Oriented-Programming Language :

Abstraction :
Let's suppose you want to turn on the bulb in your room. What do you do to switch on the bulb. You simply press the button 
and the light bulb turns on. Right? Notice that here you're only concerned with your final result, i.e., turning on the light bulb. 
You do not care about the circuit of the bulb or how current flows through the bulb. The point here is that you press the switch, 
the bulb turns on! You don't know how the bulb turned on/how the circuit is made because all these details are hidden from you. 
This phenomenon is known as abstraction. 
More formally, abstraction is the way through which only the essential info is shown to the user, 
and all the internal details remain hidden from the user.
Exp: Use mobile phone without bothering about how it was made

Polymorphism :
One entity many forms.
The word polymorphism comprises two words, poly which means many, and morph, which means forms.
In OOPs, polymorphism is the property that helps to perform a  single task in different ways.
Let us consider a real-life example of polymorphism. A woman at the same time can be a mother, wife, sister, daughter, etc. 
Here, a woman is an entity having different forms.
Let's take another example, a smartphone can work like a camera as well as like a calculator. 
So, you can see the a smartphone is an entity having different forms.
if we put water in fridge it's become ice, if we put water in 70/80 degree celsius it become steam
Here, we can say, Water is an entity,


Encapsulation :
The act of putting various components together (in a capsule).
It involves bundling the data (attributes and methods )that operate on the data into a single unit known as a class.
In java, the variables and methods are the components that are wrapped inside a single unit named class.
All the methods and variables of a class remain hidden from any other class.
A automatic cold drink vending machine is an example of encapsulation.
Cold drinks inside the machine are data that is wrapped inside a single unit cold drink vending machine.


Inheritance :
Inheritance that allows subclass or derived class to inherit the properties and behaviors of another class 
(parent class, superclass or base class).
The act of deriving new things from existing things.
In Java, one class can acquire all the properties and behaviours of other some other class
The class which inherits some other class is known as child class or sub class.
The class which is inherited is known as parent class or super class.
Inheritance helps us to write more efficient code because it increases the reusablity of the code.
Example : 
Rickshaw (Superclass)     → E-Rickshaw, Paddle rickshaw (child class) 
Phone                     → Smart Phone, Button phone 


Constructor: 
Constructor is special type of method, Used for initializing the class variables
two type : default constructors & Parameterize constructors
constructor name should be same as class name, Constructors will not return any type of value
Constructors will invoke at the time of object creation

Abstract Class:
Abstract class start with abstract keyword > abstract class A {}
Can not create object in abstract class 
Abstract method has no body > abstract void message();  ( non abstract method > void message{....})
Abstract method must be in abstract class
To achieve abstraction > two ways > abstract class (0-100%), and Interface (100%)

Interface:
Interface is a collection of abstract methods // fully abstract // supports multiple inheritance // can't make obj in interface
Interface keyword is used to declare an Interface like > Interface Animal {...}
Same class & same interface can extends but different class & Interface can not extends, have to use implements

Difference between Abstract Class & Interface:
Abstract Class Can have abstract & non abstract method while Interface can have abstract method
Class doesn't support multiple inheritance while Interface does
Abstract class is called partial abstract while Interface fully abstract 
Abstract Class contain constructor while Interface doesn't contain constructor

Super keyword:
The super keyword in Java is a reference variable which is used to refer immediate parent class object.
-super can be used to refer immediate parent class instance variable.
-super can be used to invoke immediate parent class method.
-super() can be used to invoke immediate parent class constructor.
	
*/