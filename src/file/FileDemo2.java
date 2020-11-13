package file;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileDemo2 {

    public static void main(String[] args) {
        String id, name;
        try {
            Formatter formatter = new Formatter("G:/OOP/person/student");
            Scanner input = new Scanner(System.in);
            System.out.println("How many Students :");
            int number = input.nextInt();
            for (int i = 1; i < number; i++) {
                System.out.println(" Enter id and name :");
                id = input.next();
                name = input.next();

                formatter.format("%s %s\r\n", id, name);

            }
            formatter.close();

            /*  formatter.format("%s %s\r\n","101","Sumaiya Islam");
            formatter.format("%s %s\r\n","102","Sweety");
            formatter.format("%s %s\r\n","103","Tripty");
            formatter.format("%s %s\r\n","104","Nipa");
            formatter.format("%s %s\r\n","105","Nupur");
            formatter.close();*/
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

}
