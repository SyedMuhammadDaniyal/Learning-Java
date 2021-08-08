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

 interface(has only abstract methods): (we can not make object/instance of abstract class, it is madatory to define abstract methods in child class otherwise it
will give  error, we have to declare abstract method with abstract keyword, we can implement multiple interfaces on chlid class)


## Polymorphism
1. overloading(compile time)
2. overriding(runtime)


## Encapsulation (getter and setter)
