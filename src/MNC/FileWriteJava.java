package MNC;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteJava {
    public static void main(String[] args) {
        //Create a java file
        //Handling java function programme

        try {
            File newFile=new File("filename.txt");
            //Write in file
            FileWriter wr=new FileWriter("filename.txt");
            wr.write("This is java programming first File handling programme");
            wr.write("My name is Amit Yadav and i'm a java developer for programming testing");
            wr.close();

            //Use Scanner class for read file
            Scanner read=new Scanner(System.in);
            if (newFile.createNewFile()){
                System.out.println("Created file:-"+newFile.getName());
            }else {
                System.out.println("File is already Created");
            }
        }catch (IOException e){
            System.out.println("An occurred error");
            e.printStackTrace();
        }
    }
}
