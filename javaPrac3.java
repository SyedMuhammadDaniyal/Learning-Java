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
