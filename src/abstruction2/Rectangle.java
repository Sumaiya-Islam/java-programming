
package abstruction2;


public class Rectangle extends Shape {
    //dim1,dim2
    //area=dim1*dim2
    Rectangle(double dim1, double dim2){
super(dim1,dim2);
 }
void area(){
   double result=dim1*dim2;
    System.out.println("Area of rectangle :"+result);

}


    
}
