
package inheritance2;


public class Teacher extends Person {
     String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
     void display1(){
    System.out.println(getName());
         System.out.println(getAge());
          System.out.println(getQualification());
        
    }

    
}
