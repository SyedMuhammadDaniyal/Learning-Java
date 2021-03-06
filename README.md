## Exceptions
``` java
public class MyClass {
    public static void main(String args[]) {
    // compile time error
    // (syntactical error , type error, not found error etc)
    // runtime errors
    // (logical errors, arithmatic error , type(if you give wrong type in user inp))
    
    try{
        int a = 0;
        int b = 1;
        System.out.println(a/b);
    }catch (Exception e){
        System.out.println(e);
    }
    finally{
        System.out.println("this block will always runs");
    }
    }
    
    
    int a = 0;
    if (a == 0){
        throw new ArithmeticException("division by zero");
    }
}
```
## Array
### 2D
``` java
int[][] a = new int[2][3];
        a[0][0] = 1;
        a[0][1] = 2;
        a[0][2] = 3;
        
        a[1][0] = 1;
        a[1][1] = 2;
        a[1][2] = 3;
        
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
```

## Files and I/O
``` java
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
```
1. Create file
``` java
try {
		
		File myFile = new File("hello.txt");

		if (myFile.createNewFile()){
			System.out.println("File Created");}
		else{
			System.out.println("File already Exist");
		    }
		}catch(IOException e) {
			e.printStackTrace();
		}
```
2. Write file
``` java
try
		{
			FileWriter mywriter = new FileWriter("hello.txt");
			mywriter.write("Hello WOrld");
			mywriter.close();
		}
		catch(IOException e) {
			e.printStackTrace();
			System.out.println("Not work");
		}
```
3. Read file
``` java
try {
			File myObj = new File("hello.txt");
			Scanner myReader = new Scanner(myObj);
			while(myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
		}
			
			catch(FileNotFoundException e) {
				e.printStackTrace();
			}

```
4. Delete file
``` java
 File obj = new File("hello.txt");
		if(obj.delete()) {
			System.out.println("Deleted");
		}
		else
		{
			System.out.println("not WOrk");
		}
```
# OOP (Object Oriented Programming)
## Types of constructor
1. default (is mai default value set krte hain)
``` java
class classA{
    int a;
    int b;
    classA(){
        this.a = 2;
        this.b = 3;

    }
    
    public void getter(){
        System.out.println(this.a);
        System.out.println(this.b);
    }
}
public class MyClass {
    public static void main(String args[]) {
    classA obj = new classA();
    obj.getter();
    }
}
```
3. parametrized (is mai parameter mai value pass krte hain)
``` java
class classA{
    int a;
    int b;
    classA(int a, int b){
        this.a = a;
        this.b = b;

    }
    
    public void getter(){
        System.out.println(a);
        System.out.println(this.b);
    }
}
public class MyClass {
    public static void main(String args[]) {
    classA obj = new classA(1,2);
    obj.getter();
    }
}
```

## Access Modifiers
1. public (can be access from anywhere)
2. private (can not access in child class)
3. protected (can be access in sub class of same package)
4. default (A Java default keyword is an access modifier. If you didn't assign any access modifier to variables, methods, constructors and, classes, by default, it is considered as default access modifier)
The default access modifier is accessible within the package only.
Unlike private and protected, we can create a default outer class by not assigning any access modifier to it. In such a case, it not restricted to take class name similar to a program name.
If you are overriding any method, overridden method (i.e., declared in the subclass) must not be more restrictive. So, the default method or variable can't be allowed to use private access modifier.

## Non-access Modifiers
1. static (The static keyword is a non-access modifier used for methods and attributes. Static methods/attributes can be accessed without creating an object of a class.)



# Pillars of OOP



## Inheritance
1. single inheritence
``` java
class classA{
    public void methodA(){
        System.out.println("this is class A");
    }
}
class classB extends classA{
    public void methodB(){
        System.out.println("this is class B");
    }
}
class classC extends classA{
    public void methodC(){
        System.out.println("this is class C");
    }
}

public class MyClass {
    public static void main(String args[]) {
    classB obj = new classB();
    obj.methodA();
    obj.methodB();
    classC obj1 = new classC();
    obj1.methodA();
    obj1.methodC();
    }
}
```
2. multi level
	When you compile your program the reference variable of the base class gets memory and compiler checks all the methods in that class. So it checks all the base class methods but not the child class methods. Now at runtime when the object is created, only checked methods can run. In case a method is overridden in the child class that function runs. Child class other functions aren't run because the compiler hasn't recognized them at the compile time.
  
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
3. Multiple (there is no multiple inheritance in java)
## super(The super keyword in Java is a reference variable that is used to refer parent class objects. Super can be used to call parent class??? variables and methods.)
``` java
// super keyword
class classA{
    int a = 2;
    void print(){
        System.out.println("this is class A");
    }
}

class classB extends classA{
    int a = 3;
    public int add(int b){
        super.print();
        return super.a + b;
    }
}

public class MyClass {
    public static void main(String args[]) {
        classB obj = new classB();
        System.out.println(obj.add(2));

    }
}
```
## super() ..... (The super() in Java is a reference variable that is used to refer parent class constructors. super() can be used to call parent class??? constructors only.)
``` java
class classA{
    int a;
    classA(int a){
        this.a = a;
    }
}

class classB extends classA{
    int b;
    classB(int a, int b){
        super(a);
        this.b = b;
    }
    public int add(){
        return super.a+ b;
    }
}

public class MyClass {
    public static void main(String args[]) {
       classB obj = new classB(1,2);
       System.out.println(obj.add());

    }
}
```
## Has a relation
### Association (makes an object of a class in another class)
1. Aggregation (two class are independent)
``` java
class Car{
    Driver driver = new Driver();
}

class Driver{
    Driver(){
        System.out.println("this is shapater driver");
    }
}
```
3. Composition (two class are dependent)
``` java
class Engine{
    Engine(){
        System.out.println("this is engine of car");
    }
}

class Car{
// engine is instance variable
        Engine engine = new Engine();

}
public class MyClass {
    public static void main(String args[]) {
        Car civic = new Car();     
    }
}
```

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
2. overriding(runtime)
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


## Encapsulation (hiding the code)
getters and setters
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

## Data Structures
1. Linked List
``` java
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

class LinkedList{
    Node head;
    Node nxt1;
    
    public void addNode(int data){
        if (this.head == null){
            this.head = new Node(data);
            System.out.println(head);
        }else{
            Node node = new Node(data);
            nxt1 = head;
            while (nxt1.next != null){
                nxt1 = nxt1.next;
            }
            nxt1.next = node;
        }
    }
    
    public void print(){
        nxt1 = head;
        while (nxt1 != null){
            System.out.println(nxt1.data);
            nxt1 = nxt1.next;
        }
    }
}
public class MyClass {
    public static void main(String args[]) {
        LinkedList obj = new LinkedList();
        obj.addNode(1);
        obj.addNode(2);
        obj.print();
    }
}
```
2. Stack
``` java
class Stack{
    int[] arr;
    int ind = 0;
    Stack(int size){
        this.arr = new int[size];
    }
    
    public void push(int item){
        if (this.arr.length > this.ind){
            this.arr[this.ind] = item;
            this.ind += 1;
        }else{
            System.out.println("your stack is full");
        }
    }
    
    public void pop(){
        if (this.ind != 0){
            int a = this.arr[this.ind-1];
            this.arr[this.ind-1] = 0;
            this.ind -= 1;
            System.out.println(a);
        }else{
            System.out.println("cannot delete an element from empty stack");
        }
    }
    
    public void show(){
        System.out.print("[");
        for (int i = 0; i < this.arr.length; i++){
            System.out.print(this.arr[i] + " ");
        }
        System.out.print("]");
    }
}

public class MyClass {
    public static void main(String args[]) {
      Stack stack = new Stack(3);
      stack.push(2);
      stack.push(3);
      stack.push(4);
      stack.show();
      stack.pop();
      
    }
}
```
4. Queue
``` java
class MyQueue{
    int[] arr;
    int rear  =0;
    int size;
    MyQueue(int size){
        this.size = size;
        this.arr = new int [size];
    }

    public void enqueue(int data){
        if (rear != size-1){
        this.arr[rear] = data;
        rear += 1;
        }
    
    }

    public void dequeue(){
        this.arr[0] = 0;
        for (int i= 0; i < rear-1; i++){
            arr[i] = arr[i+1];
        }
        rear -=1;
    }

    public void traverse(){
        for (int j= 0; j < rear; j++){
            System.out.print(this.arr[j] + "  ");
        }
        System.out.println("");
    }
}


public class queue{
public static void main(String[] args) {
    MyQueue obj = new MyQueue(5);
    System.out.println("enqueue");
    obj.enqueue(1);
    obj.enqueue(2);
    obj.enqueue(3);
    obj.traverse();
    System.out.println("dequeue");
    obj.dequeue();
    obj.traverse();

}
}
```
6. Binary Tree
``` python
class Node:
    def __init__(self, data) -> None:
        self.left = None
        self.right = None
        self.data = data


class BinaryTree:
    def __init__(self) -> None:
        self.root = None

    def insert(self, data):
        newNode = Node(data)

        if self.root == None:
            self.root = newNode

        else:
            queue = []
            queue.append(self.root)

            while True:
                node = queue.pop(0)

                if node.left != None and node.right != None:
                    queue.append(node.left)
                    queue.append(node.right)
                else:
                    if node.left == None:
                        node.left = newNode
                        queue.append(node.left)
                    else:
                        node.right = newNode
                        queue.append(node.right)
                    break
    def inorder_traversal(self, node = None):
        if node == None:
            node = self.root
        if(self.root == None):  
            print("Tree is empty")  
            return  
        else:  
            if(node.left != None):  
                self.inorder_traversal(node.left)  
            print(node.data) 
            if(node.right!= None):  
                self.inorder_traversal(node.right)
    
    def preorder_traversal(self, node = None):
        if node == None:
            node = self.root
        if(self.root == None):  
            print("Tree is empty")  
            return  
        else:
            print(node.data) 
            if(node.left != None):  
                self.inorder_traversal(node.left)  
            if(node.right!= None):  
                self.inorder_traversal(node.right)

    def postorder_traversal(self, node = None):
        if node == None:
            node = self.root
        if(self.root == None):  
            print("Tree is empty")  
            return  
        else:
            if(node.left != None):  
                self.inorder_traversal(node.left)  
            if(node.right!= None):  
                self.inorder_traversal(node.right)
            print(node.data) 

obj = BinaryTree()

obj.insert(1)
obj.insert(2)
obj.insert(3)
obj.insert(4)
obj.insert(5)
obj.insert(6)
obj.insert(7)
obj.insert(8)

print("Inorder Traversal")
obj.inorder_traversal()

print("Preorder Traversal")
obj.preorder_traversal()

print("Postorder Traversal")
obj.postorder_traversal()

```
7. Binary Search Tree
 ``` python
 class Node:
    def __init__(self, data) -> None:
        self.left = None
        self.right = None
        self.data = data


class BinarySearchTree:
    def __init__(self) -> None:
        self.root = None

    def insert(self, data):
        newNode = Node(data)

        if self.root == None:
            self.root = newNode
        
        else:
            node = self.root
            while True:
                if data < node.data:
                    if node.left == None:
                        node.left = newNode
                        break
                    else:
                        node = node.left
                elif data > node.data:
                    # print(data)
                    # print(node.data)
                    if node.right == None:
                        node.right = newNode
                        break
                    else:
                        node = node.right

    def inorder_traversal(self, node = None):
        if node == None:
            node = self.root
        if(self.root == None):  
            print("Tree is empty")  
            return  
        else:  
            if(node.left != None):  
                self.inorder_traversal(node.left)  
            print(node.data) 
            if(node.right!= None):  
                self.inorder_traversal(node.right)
    
    def preorder_traversal(self, node = None):
        if node == None:
            node = self.root
        if(self.root == None):  
            print("Tree is empty")  
            return  
        else:
            print(node.data) 
            if(node.left != None):  
                self.inorder_traversal(node.left)  
            if(node.right!= None):  
                self.inorder_traversal(node.right)

    def postorder_traversal(self, node = None):
        if node == None:
            node = self.root
        if(self.root == None):  
            print("Tree is empty")  
            return  
        else:
            if(node.left != None):  
                self.inorder_traversal(node.left)  
            if(node.right!= None):  
                self.inorder_traversal(node.right)
            print(node.data) 

        
obj = BinarySearchTree()

obj.insert(3)
obj.insert(1)
obj.insert(6)
obj.insert(2)
obj.insert(5)
obj.insert(7)
obj.insert(0)


print("Inorder Traversal")
obj.inorder_traversal()

print("Postorder traversal")
obj.postorder_traversal()

print("Preorder Traversal")
obj.preorder_traversal()   
 
 ```
8. Graph
``` python
class AdjNode:
    def __init__(self, data):
        self.vertex = data
        self.next = None
  

class Graph:
    def __init__(self, vertices):
        self.V = vertices
        self.graph = [None] * self.V
        self.cities = ["Karachi", "Lahore", "Islamabad", 'Peshawar', "Quetta"]

    def add_edge(self, src, dest):
        src = self.cities.index(src)
        dest = self.cities.index(dest)

        node = AdjNode(dest)
        node.next = self.graph[src]
        self.graph[src] = node

        node = AdjNode(src)
        node.next = self.graph[dest]
        self.graph[dest] = node
  
    def print_graph(self):
        for i in range(self.V):
            print("Adjacency list of vertex {}\n head".format(i), end="")
            temp = self.graph[i]
            while temp:
                print(" -> {}".format(self.cities[temp.vertex]), end="")
                temp = temp.next
            print(" \n")
    
    def show_path(self, start, end):
        data = []
        start = self.cities.index(start)
        end = self.cities.index(end)
        for i in range(self.V):
            if self.graph[i].vertex != start:
                continue
            else:
                temp = self.graph[i].next
                temp1 = self.graph[i]
                while temp:
                    if temp.vertex == end:
                        temp.next = None
                        temp = temp.next
                        data.append(temp1)
                    else:
                        temp = temp.next
        for i in data:
            while i:
                print(self.cities[i.vertex], end=" -> ")
                i = i.next
            print()

if __name__ == "__main__":
    V = 5
    graph = Graph(V)

    graph.add_edge('Lahore', 'Karachi')
    graph.add_edge('Karachi', 'Islamabad')
    graph.add_edge('Islamabad', 'Lahore')
    graph.add_edge('Islamabad', 'Peshawar')
    graph.add_edge('Quetta', 'Peshawar')
    graph.add_edge('Quetta', 'Karachi')
    graph.add_edge('Quetta', 'Islamabad')

    graph.print_graph()

    graph.show_path('Quetta', 'Lahore')
```
9. Chain Method (Hash table)
``` python
class ChainHashing:
    def __init__(self) -> None:
        self.hash_map = {}
        self.length = 10

    def insert(self, data):
        # key address using hash function
        # (2k+3) % length
        # if hash function is not given then use key_address = (k%length)
        key = (2*data + 3) % self.length
        if key in self.hash_map.keys():
            self.hash_map[key].append(data)
        else:
            self.hash_map[key] = [data]
    
    def print_hash(self):
        print(self.hash_map)

obj = ChainHashing()

obj.insert(3)
obj.insert(2)
obj.insert(9)
obj.insert(6)
obj.insert(11)
obj.insert(13)
obj.insert(7)
obj.insert(12)

obj.print_hash()

```
10. Linear probing (hash table)
``` python
class LinearProbing:
    def __init__(self) -> None:
        self.hash_map = {}
        self.length = 10

    def insert(self, data):
        
        key_address = (2*data+3)%self.length
        if key_address in self.hash_map.keys():
            for i in range(self.length):
                new_key_address = (key_address+i) % self.length
                if new_key_address in self.hash_map.keys():
                    continue
                else:
                    self.hash_map[new_key_address] = data
                    break
        else:
            self.hash_map[key_address] = data
    
    def print_hash(self):
        print(self.hash_map)


obj = LinearProbing()

obj.insert(3)
obj.insert(2)
obj.insert(9)
obj.insert(6)
obj.insert(11)
obj.insert(13)
obj.insert(7)
obj.insert(12)

obj.print_hash()

```
11. Quadratic Probing (Hash Table)
``` python
class QuadraticProbing:
    def __init__(self) -> None:
        self.hash_map = {}
        self.length = 10

    def insert(self, data):
        
        key_address = (2*data+3)%self.length
        if key_address in self.hash_map.keys():
            for i in range(self.length):
                new_key_address = (key_address+i**2) % self.length
                if new_key_address in self.hash_map.keys():
                    continue
                else:
                    self.hash_map[new_key_address] = data
                    break
        else:
            self.hash_map[key_address] = data
    
    def print_hash(self):
        print(self.hash_map)


obj = QuadraticProbing()

obj.insert(3)
obj.insert(2)
obj.insert(9)
obj.insert(6)
obj.insert(11)
obj.insert(13)
obj.insert(7)
obj.insert(12)

obj.print_hash()
```
