
package static_block;


public class StaticBlock {
    static int id;
    static  String name;
    static{
        
        id=102;
        name="Sumaiya";
    }
   static void display(){
        System.out.println("ID :"+id);
        System.out.println("Name :"+name);
    }
    
}
