
package inheritance;


public class Teacher extends Student{
    //name,age,display1()
    String qualification;
    void display2(){
        display1();
        System.out.println("Qualification :"+qualification);
    
    }
    
}
