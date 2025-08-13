package MNC;

import java.util.Scanner;

public class OddEvenNum {
    public static void main(String[] args) {
        //Create java programme find the odd and even number
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:-");
        float num=sc.nextFloat();

        if (num%2==0){
            System.out.println("You are Entered Sum number and value is:-"+num);
        }
        else {
            System.out.println("You are Entered Odd number and value is:-"+num);
        }
    }
}
