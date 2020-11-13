
package modifier2;

import modifier1.A;

public class C extends A{
    public static void main(String[] args) {
         C ob=new C();
          ob.display3();/*protected member can access 
                           from another package if the class of protected 
                           member package is inherited to the new class og new package*/
    }
    
}
