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
