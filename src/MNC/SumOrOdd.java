package MNC;

import java.util.Scanner;

public class SumOrOdd {
    public static void main(String[] args) {
        //Create java programme find sum or odd number's
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num=sc.nextInt();

        if (num%2==0){
            System.out.println(num+" is even");
        }else {
            System.out.println(num+" is odd");
        }
    }
}
