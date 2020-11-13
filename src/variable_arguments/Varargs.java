
package variable_arguments;

public class Varargs {
    
  /*  void add(int num1, int num2){
        System.out.println("Add ="+(num1+num2));
    
    }
    void add(int num1, int num2, int num3){
        System.out.println("Add ="+(num1+num2+num3));
    
    }*/
    void add(int ... num){
        
        int sum=0;
        
        for (int x : num) {
            sum=sum+x;
            
        }
        System.out.println("sum="+sum);
    
    }
    
}
