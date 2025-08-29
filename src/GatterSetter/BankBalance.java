package GatterSetter;

class Balance{
    private double balance;

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        if (balance>=0){
            this.balance=balance;
        }else {
            System.out.println("Balance can't be negative!");
        }
    }
}
public class BankBalance {
    public static void main(String[] args) {
        Balance bl=new Balance();
        bl.setBalance(2000.20);
        System.out.println("Current Balance is: "+bl.getBalance());

        bl.setBalance(-251123.200);
        System.out.println("Current Balance is: "+bl.getBalance());
    }
}
