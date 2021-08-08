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
