
package student_information;


public class StudentInformation {
  static  int count=0;
    StudentInformation(){
    count++;
    }
    void totalStudent(){
        System.out.println("Total student ="+count);
    
    }
    //static method..
    void display1(){
        display2();//can call static method from static method.
        
        System.out.println("I am non static method");
    }
    static void display2(){
        
        System.out.println("I am static method");
    }
    
    
}
