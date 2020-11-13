
package polymorphism2;


public class Test {
    public static void main(String[] args) {
   Shape[] s=new Shape[3];
      s[0]=new Shape();
       s[1]=new Rectangle(2,5);
       s[2]=new Trangle(12,4);
        for (int i = 0; i < 3; i++) {
          System.out.println(s[i].area());  
        }
       
        /*   System.out.println(s[0].area());
         System.out.println(s[1].area());
          System.out.println(s[2].area());*/
        
      
        /* Shape s1=new Shape();
         Shape s2=new Rectangle(10,20);
       Shape s3=new Trangle(10,50);
        System.out.println(s1.area());
         System.out.println(s2.area());
          System.out.println(s3.area());*/
       
       
       
    }
    
}
