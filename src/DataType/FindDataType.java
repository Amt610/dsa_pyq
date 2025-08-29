package DataType;

import java.util.Scanner;

public class FindDataType {
    public static void main(String[] args) {
        //Take input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Something: ");
        
        if (sc.hasNextInt()){
            System.out.println("Integer: "+sc.hasNextInt());
        } else if (sc.hasNextBoolean()) {
            System.out.println("Boolean: "+sc.hasNextBoolean());
        } else if (sc.hasNextDouble()) {
            System.out.println("Double: "+sc.hasNextDouble());
        }
        else {
            System.out.println("Character/String");
        }
    }
}
