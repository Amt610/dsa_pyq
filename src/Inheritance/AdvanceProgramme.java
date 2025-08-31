package Inheritance;

abstract class Bank{
    abstract void bankRate();
    void bank(){
        System.out.println("this is Bank Programme....");
    }
}

class HDFC extends Bank{
    void bankRate(){
        System.out.println("HDFC Bank Rate 7.1....");
    }
    void display(){
        System.out.println("this is HDFC bank.....");
    }
}

class SBI extends Bank{
    @Override
    void bankRate(){
        System.out.println("SBI Bank Rate 8.1.....");
    }
    void display(){
        System.out.println("this is sbi bank");
    }
}



public class AdvanceProgramme {
    public static void main(String[] args) {
        //Access Bank intrst Rate
        Bank sbi=new SBI();
        sbi.bankRate();
        sbi.bank();

        Bank hdfc=new HDFC();
        hdfc.bankRate();
        hdfc.bank();
    }
}
