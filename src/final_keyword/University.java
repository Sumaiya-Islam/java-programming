
package final_keyword;

public class University {
   final String UNIVERSITY_NAME="IUBAT";
    final int fees;//blank final variable
   static final int age;//static blank final variable
   //final class can not be extends and final method can't be overridden but can be inherited
   
   static{
   age=29;
   }
    
    University(){
    fees=16000;
    }
    void display(){
        System.out.println("Name :"+UNIVERSITY_NAME);
        System.out.println("Fees :"+fees);
                System.out.println("Age :"+age);
    }
    
}
