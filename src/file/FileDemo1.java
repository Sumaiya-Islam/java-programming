
package file;

import java.io.File;


public class FileDemo1 {
    public static void main(String[] args) {
       File dir =new File("person");
       // File dir =new File("C:/Users/User/Desktop/person");
        dir.mkdir();// directory will be created
   String location= dir.getAbsolutePath();
           /* System.out.println("location :"+location);
        System.out.println(dir.getName());
        if (dir.delete()) {
            System.out.println("Folder has been deleted");
            
        }*/
    File file1=new File(location+"/student");
    //File file1=new File("student");
   
      File file2=new File("teacher");
      try   {
          file1.createNewFile();
          file2.createNewFile();
          System.out.println("Files are created");
      
      
      }catch(Exception e){
      
          System.out.println(e);
      }
      file2.delete();
        if (file2.exists()) {
            System.out.println("File exist");
            
        }else{
            System.out.println("File is not exist .");
        }
      
    }
    
}
