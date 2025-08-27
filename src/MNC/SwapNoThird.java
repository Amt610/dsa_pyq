package MNC;

import java.util.Scanner;

public class SwapNoThird {
    public static void main(String[] args) {
        //create java swap value programme without third variable
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter first num: ");
        int a=sc.nextInt();

        System.out.print("Enter second numb: ");
        int b=sc.nextInt();

        System.out.println("before swap value of a and b is:-"+" a is "+a+" b is "+b);

        System.out.println("After swaping value is ");

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a value is "+a+" b value is "+b);
    }
}
