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
