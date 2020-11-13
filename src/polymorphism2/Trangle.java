

package polymorphism2;


public class Trangle extends Shape{
    double base,height;
    
    Trangle(double base, double height){
        this.base=base;
        this.height=height;
    
    
    }
    
    @Override
     double area(){
           System.out.println("Area of triangle :");
          return 0.5*base*height;
     }
    
}
