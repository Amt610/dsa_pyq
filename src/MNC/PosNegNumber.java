package MNC;

import java.util.Scanner;

public class PosNegNumber {
    public static void main(String[] args) {
        //Scanner class define
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number:-");
        int data=sc.nextInt();

        if (data>0){
            System.out.println("the enter number positve data isL-"+data);
        } else if (data==0) {
            System.out.println("the enter number zero data is:-"+data);
        }
        else {
            System.out.println("this entered  negative number is :-"+data);
        }
    }
}
