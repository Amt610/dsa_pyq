package DataType;

public class SwapTwoVariable {
    public static void main(String[] args) {
        //swap two value without third variable
        int a=56;
        int b=654;
        System.out.println(a);
        System.out.println(b);

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
}
