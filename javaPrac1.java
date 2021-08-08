import java.util.Scanner;

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

public class javaPrac1 {
    public static void main(String[] args) {
        // A objC = new A();
        // System.out.println(objC);
        // objC.className1();
        // objC.className();

        // // C objC = new C();
        // objC.className2();

        Scanner sc = new Scanner(System.in);
        System.out.print("enter your name: ");
        
        String obj = sc.nextLine();
        System.out.println(obj);

    }
}
