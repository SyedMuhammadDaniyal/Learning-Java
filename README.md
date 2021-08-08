# Learning-Java

exception, default, static, super, array(1D, 2D), data types, packages

## Types of constructor
1. default (is mai default value set krte hain)
2. parametrized (is mai parameter mai value pass krte hain)

## Access Modifiers
public (can be access from anywhere)
private (can not access in child class)
protected (can be access in sub class of same package)



# Pillars of OOP



## Inheritance
1. single inheritence
2. multi level
	agr hamne obj banate waqt parent class type mai parent class dedi
	tu wo jis class ka obj ban rha hai us k methods ko access nai kr skte
	EXAMPLE CODE
  
  ``` java
	class A{
    		public void className(){
        	System.out.println("this is class A");
    	}
	}

	class B extends A{
    		public void className1(){
        	System.out.println("this is class B");
    	}
	}

	class C extends B{
    		public void className2(){
        	System.out.println("this is class C");
    	}
	}

	// main method
	 A objC = new C();
        System.out.println(objC);
        objC.className1();
        objC.className();

        // C objC = new C();
        objC.className2();

	}
}
```
#### aggregation (has a relation)(yahan inheritence ki jaga aik class ko dosri class mai instanciate krengay)

## Abstraction(abstract class and interface)
absract class(has abstract as well as concrete method): (we can not make object/instance of abstract class, it is madatory to define abstract methods in child class otherwise it
will give  error, we have to declare abstract method with abstract keyword)
``` java
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void animalSound();

    // Regular method, non-abstract method, concrete method
    public void sleep() {
        System.out.println("Zzz");
    }
}

// Subclass (inherit from Animal)
class Pig extends Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
    public void print(){
        System.out.println("this is a method");
    }
    
}

class Dog extends Animal{
    public void animalSound() {
        System.out.println("The dog says: bhao bhao");
    }
}
public class javaPrac2 {
    public static void main(String args[]) {
      Pig myPig = new Pig(); // Create a Pig object
        // myPig.animalSound();
        myPig.sleep();
        myPig.print();

    //     Dog dog = new Dog();
    //     dog.animalSound();
    //     dog.sleep();
        
    // Animal animal = new Animal();
    //     System.out.println(animal);
      
    }
}
```

interface(has only abstract methods): (we can not make object/instance of abstract class, it is madatory to define abstract methods in child class otherwise it
will give  error, we have to declare abstract method with abstract keyword, we can implement multiple interfaces on chlid class)
``` java
interface interA{
    void method1();
    void method2();
}

interface interB{
    void method3();
    void method4();
}

class classB implements interA, interB{
    public void method1(){
        System.out.println("this is method 1");
    }
    public void method2(){
        System.out.println("this is method 2");
    }
    public void method3(){
        System.out.println("this is method 3");
    }
    public void method4(){
        System.out.println("this is method 4");
    }
}



public class javaPrac3 {
    public static void main(String[] args) {
        classB obj = new classB();
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
        // interA obj2 = new interA();
        
    }
}

```


## Polymorphism
1. overloading(compile time)
Constructor Overloading
``` java
class classA{
    int a;
    int b;
    int c;
    classA(int num1, int num2){
        this.a = num1;
        this.b = num2;
    }
    
    classA(int num1, int num2, int num3){
        this.a = num1;
        this.b = num2;
        this.c = num3;
    }
    
    public void printA(){
        System.out.println(this.a);
    }
}


public class javaPrac4 {
    public static void main(String[] args) {
        classA obj = new classA(1,2);
        obj.printA();
        classA obj2 = new classA(3,2,1);
        obj2.printA();
        
    }
}
```

Method Overloading
``` java
class classA{
    public void method(int a){
        System.out.println(a);
    }
    
    public void method(int a, int b){
        System.out.println(a + " " +b);
    }
}


public class javaPrac5 {
    public static void main(String[] args) {
        classA obj = new classA();
        obj.method(1);
        obj.method(2,1);
    }
}
```
3. overriding(runtime)
``` java
class classA{
    public void print(){
        System.out.println("this is class A");
    }
}

class classB extends classA{
    public void print(){
        System.out.println("this is class B");
    }
}

public class javaPrac6 {
    public static void main(String[] args) {
        classB obj = new classB();
        obj.print();
        
        
    }
}
```


## Encapsulation (getter and setter)
``` java
class Shape{
    String name;
    // Shape(String name){
    //     this.name = name;
    // }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}


public class javaPrac {
    public static void main(String[] args) { 
        Shape shape = new Shape();
        shape.setName("Rectangle");
        String var = shape.getName();
        System.out.println("Name of shape is: "+var);       
    }
}

```
