
package static_keyword;

public class Main {
    public static void main(String[] args) {
        Student st1=new Student("Sumaiya", 101);
        Student st2=new Student("Sweety", 102);
        st1.displayInformation();
        System.out.println();
        st2.displayInformation();
        System.out.println("University name:"+Student.universityName);
        
    }
    
}
