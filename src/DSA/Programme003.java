package DSA;

//print how many odd numbers   1 to 100
public class Programme003 {
    public static void main(String[] args) {
        //Create loops
        //init initlization count
        int count=0;

        for (int i = 1; i <=100 ; i++) {
            //define condition
            if (i%2==1){
                count++;
            }
        }

        System.out.println("the total odd number is:-"+count);
    }
}
