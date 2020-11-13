
package string_comparis0n;


public class UsingEqualstoMethod {
   
        public static void main(String[] args) {
        String password1="sumaiya123";
        String password2="sumaiya123";
        String password3=new String ("Sumaiya123");
        String password4=new String ("sumaiya13");
        
        System.out.println(password1.equals(password2));
        System.out.println(password1.equalsIgnoreCase(password3));
        System.out.println(password3.equals(password4));
        
    }
    }
    

