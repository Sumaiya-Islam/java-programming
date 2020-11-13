
package abstruction2;


public class Test {
    public static void main(String[] args) {
       Shape shape;
       shape=new Rectangle(20,10);
       shape.area();
       
        shape=new Triangle(20.3,10);
       shape.area();
       
        shape=new Circle(5);
       shape.area();
        
    }
    
}
