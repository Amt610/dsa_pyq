package MNC;

import java.util.Scanner;

public class NegPosZero {
    public static void main(String[] args) {
        //Negative Positive and Zero
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number: ");
        int num=sc.nextInt();

        if(num>0){
            System.out.println(num+" is greater than zero value");
        } else if (num==0) {
            System.out.println(num+" is equal to zero");
        }else {
            System.out.println(num+" is less than to zero");
        }
    }
}
