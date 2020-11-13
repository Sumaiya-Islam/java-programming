
package student_information;


public class TestStudentInfo {
    public static void main(String[] args) {
        StudentInformation s1=new StudentInformation();
        s1.totalStudent();
        
         StudentInformation s2=new StudentInformation();
        s2.totalStudent();
        
         StudentInformation s3=new StudentInformation();
        s3.totalStudent();
        //static method...
        s1.display1();
        StudentInformation.display2();
        
    }
    
}
