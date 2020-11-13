
package type_casting;


public class Test {
    public static void main(String[] args) {
        int x=10;
        double y=x;//implicit typeCasting
     //double y=10;//implicit typeCasting
        System.out.println("y ="+y);
        double w =60.5;
        int s=(int) w; //explicit typeCasting
        System.out.println("S ="+s);
        
    }
    
}
