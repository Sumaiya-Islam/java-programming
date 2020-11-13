
package polymorphism;


public class Test {
    public static void main(String[] args) {
        Person p=new Person();
        p.display();
       p=new Teacher();//run-time polymorphism
       p.display();
        p=new Student();//run-time/dynamic dispatch polymorphism
        p.display();
        
    }
    
}
