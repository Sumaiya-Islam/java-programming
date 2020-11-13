
package this_keyword;

public class Person {
    
    String name,hairColor;
    int age;
    Person(String name, int age){
      this.name=name;
        this.age=age;
    }
     Person(String name, int age, String hairColor){
         
     this(name, age);
        this.hairColor=hairColor;
    }
     void message(){
         System.out.println("I am message mthod");
     
     
     }
    void display(){
        message();
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
         System.out.println("HairColor :"+hairColor);
            
    
    }
    
}
