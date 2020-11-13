
package modifier1;


public class Test {
    public static void main(String[] args) {
      A ob=new A();
      //ob.display();//private member has no access outside that class
    ob.display2();//public member has access from anywhere
     ob.display3();//protected member 
         ob.display4();//default member has access only same package not another package
}
}