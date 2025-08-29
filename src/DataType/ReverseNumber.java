package DataType;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        //Create java programme Reverse Number
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number: ");
        int num= sc.nextInt();

        int Reversed=0;

        while (num!=0){
            int digits=num%10;
            Reversed=Reversed*10+digits;
            num=num/10;
        }
        System.out.println("Reversed Number: "+Reversed);
    }
}
