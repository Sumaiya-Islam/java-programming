
package string_comparis0n;


public class UsingEqualOperator {
    public static void main(String[] args) {
        String password1="sumaiya123";
        String password2="sumaiya123";
        String password3=new String ("sumaiya123");
        String password4=new String ("sumaiya123");
        
        System.out.println(password1==password2);
        System.out.println(password1==password3);
        System.out.println(password3==password4);
        
    }
    
}
