
package linkedlist;

import java.util.LinkedList;


public class StudentListDemo {
    public static void main(String[] args) {
        //student linkedlist
        LinkedList<Student> list=new LinkedList<Student>();
        
        // student create
        Student s1=new Student(101, "Sumaiya", "Bsc");
        Student s2=new Student(102, "Sweety", "BA");
        Student s3=new Student(103, "Rupa", "Bcom");
        Student s4=new Student(104, "John", "BBA");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
         //display information
         
         for(Student st : list){
             System.out.println(st.id +"  "+st.name +"  "+st.className);
         
         
         
         }
    }
    
}
