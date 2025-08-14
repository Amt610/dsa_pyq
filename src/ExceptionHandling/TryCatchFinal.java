package ExceptionHandling;

public class TryCatchFinal {
    public static void main(String[] args) {
        //Create java programme try catch and finally
        try {
            System.out.println("this section when run when code is true");
            int d=10/0;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Thats line code is always runs");
        }
    }
}
