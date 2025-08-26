package MNC;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        //Create java programme and find the largest number
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num x:-");
        int x=sc.nextInt();

        System.out.println("==============");
        System.out.print("Enter num y:-");
        int y=sc.nextInt();

        System.out.println("==============");
        System.out.print("Enter num z:-");
        int z=sc.nextInt();

        if(x>y && x>z){
            System.out.println("x is the greatest number:-"+x);
        } else if (y>x && y>z) {
            System.out.println("y is the greatest number:-"+y);
        } else if (z>x && z>y) {
            System.out.println("z is the greatest number:-"+z);
        }

        System.out.println("You Entered number is :-"+" x is "+x+" y is "+y+" x is "+z);
    }
}
