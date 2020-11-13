
package call_by_value;

public class Main {
    public static void main(String[] args) {
        CallByValue ob=new CallByValue();
        int x=10;//primitive data
        System.out.println("Before calling method x ="+x);
        ob.change(x);
        System.out.println("After calling method x ="+x);
        
        
        
        
    }
    
}
