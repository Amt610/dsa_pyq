package MNC;

import java.util.Scanner;

public class InThreeLargestNum {
    public static void main(String[] args) {
        //find the largest number in three numbers
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a=sc.nextInt();

        System.out.print("Enter second number: ");
        int b=sc.nextInt();

        System.out.print("Enter third number: ");
        int c=sc.nextInt();


        if(a>b && a>c){
            System.out.println(a+" is largest number");
        } else if (b>a && b>c) {
            System.out.println(b+" is largest number");
        } else if (c>a && c>b) {
            System.out.println(c+" is largest number");
        }
    }
}
