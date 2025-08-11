package MNC;

import java.io.File;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        try {
            File myfile = new File("filename.txt");
            if (myfile.createNewFile()){
                System.out.println("file is created: "+myfile.getName());
            }else {
                System.out.println("file is already exists");
            }
        }catch (IOException e){
            System.out.println("An error ocurred");
            e.printStackTrace();
        }
    }
}
