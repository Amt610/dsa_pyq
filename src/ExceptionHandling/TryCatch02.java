package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch02 {
    public static void main(String[] args) {
        //Create java Try Catch Programme
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number:-");
        int num=sc.nextInt();

        try {
            if (num/2==0){
                System.out.println("the number is even");
            }
            else {
                System.out.println("the number is odd");
            }
        }catch (InputMismatchException e){
            System.out.println("this error is:-"+e.getMessage());
        }
    }
}
