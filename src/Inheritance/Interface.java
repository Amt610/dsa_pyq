package Inheritance;

interface Printer{
    void print();
}


interface Scanner{
    void scan();
}


//in class add interface using implement method
class Machine implements Printer,Scanner{
    @Override
    public void scan() {
        System.out.println("This is Printer Machine");
    }

    @Override
    public void print() {
        System.out.println("This is Scanner Machine");
    }
}
public class Interface {
    public static void main(String[] args) {
        //Machine java programme
        Machine mn=new Machine();
        mn.print();
        mn.scan();
    }
}
