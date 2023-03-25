package academy.devdojo.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class IoTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try {
            boolean isDeleted = file.delete();
            System.out.println(isDeleted);
         boolean isCreated =   file.createNewFile();
         System.out.println(isCreated);
         boolean exists = file.exists();
         if(exists) {
            System.out.println("Delete"+file.delete());
         }
         
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
       
    }
}
