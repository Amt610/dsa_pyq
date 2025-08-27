package MNC;

import java.util.Scanner;

public class TwoNumEqual {
    public static void main(String[] args) {
        //Check if two number are equal or not
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a=sc.nextInt();

        System.out.print("Enter second number: ");
        int b=sc.nextInt();

        if (a==b){
            System.out.println(a+" is eqaul to "+b);
        }else {
            System.out.println(a+" is not eqaul to "+b);
        }
    }
}
