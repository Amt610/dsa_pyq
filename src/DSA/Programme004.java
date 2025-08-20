package DSA;

public class Programme004 {
    public static void main(String[] args) {
        //Create java programme and print how many even num between 1 to 100
        int count=0;

        for (int i = 1; i <=100 ; i++) {
            if (i%2==0){
                count++;
            }
        }
        System.out.println("total number of sum is:-"+count);
    }
}
