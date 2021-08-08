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
