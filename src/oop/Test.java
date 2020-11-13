
package oop;


public class Test {
    public static void main(String[] args) {
         Teacher teacher1=new Teacher();//decaring and creating object...
  // teacher1.setInformation("Sumaiya Islam","Female",1712);
      teacher1.displayInformation();
      /*  teacher1.name="Sumaiya Islam";
     teacher1.gender="Female";
      teacher1.phone=1712;
      
      System.out.println("Name :"+ teacher1.name);
           System.out.println("Gender :"+ teacher1.gender);
              System.out.println("Phone :"+ teacher1.phone);*/
              
           System.out.println();   
          Teacher teacher2=new Teacher("Sumaiya Sweety","Female");//decaring and creating object...     
              
     // teacher2.setInformation("Sumaiya Sweety","Female",17122);
      teacher2.displayInformation();
       /*          teacher2.name="Sumaiya Sweety";
     teacher2.gender="Female";
      teacher2.phone=1712;
      
      System.out.println("Name :"+ teacher2.name);
           System.out.println("Gender :"+ teacher2.gender);
              System.out.println("Phone :"+ teacher2.phone);*/
        System.out.println();
            Teacher teacher3=new Teacher("Sumaiya Islam Sweety","Female",17122);
            teacher3.displayInformation();
    
        
    }
   
    
}
