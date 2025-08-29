package DataType;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        //Create java print palindrome programme
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=sc.nextInt();
        int reversed=0;
        int original=num;

        while (num!=0){
            int digits=num%10;
            reversed=reversed*10+digits;
            num=num/10;
        }
        if (original == reversed) {
            System.out.println(original+" is Palindrome");
        }else {
            System.out.println(original+" is NOT Palindrome");
        }
    }
}
