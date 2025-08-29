package DataType;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        //Count number in java programme
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");

        Long num= sc.nextLong();
        int count=0;

        while (num !=0){
            num/=10;
            count++;
        }
        System.out.println("Total digits: "+count);
    }
}
