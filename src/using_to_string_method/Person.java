
package using_to_string_method;


public class Person {
    String name;
    int age;
    Person(String name, int age){
       this.name=name;
       this.age=age;
    
    }
    @Override
    public String toString(){
    return "Name :"+name+"\nAge :"+age;
    }
}
