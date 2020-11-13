
package method_overriding;


public class Test {
    public static void main(String[] args) {
        Teacher t1=new Teacher();
        t1.name="Sumu";
        t1.age=21;
        t1.qualification="BSC";
        t1.display();
        
        System.out.println();
        
         Person p1=new Person();
        p1.name="Sumaiya";
        p1.age=22; 
        p1.display();
    }
    
}
