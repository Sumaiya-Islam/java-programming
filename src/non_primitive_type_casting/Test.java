
package non_primitive_type_casting;


public class Test {
    public static void main(String[] args) {
    Person p = new  Teacher(); //upCasting
        p.display();
        Teacher t=(Teacher) new Person(); //downCasting..it shows runtime error...
        t.display();
       
    }
    
}
