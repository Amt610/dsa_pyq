package Interface;

//create interface for calculator
interface Calculator{
    int calculator(int x, int y);
}

//addition calculator using class
class Addition implements Calculator{
    public int calculator(int x, int y){
        return x+y;
    }
}

//multiplication calculator using class
class Multiplication implements Calculator{
    public int calculator(int x,int y){
        return x*y;
    }
}

//Division calculator using class
class Division implements Calculator{
    public int calculator(int x,int y){
        return x/y;
    }
}

//Substraction using class
class Substraction implements Calculator{
    public int calculator(int x,int y){
        return x-y;
    }
}
public class InterfaceCalculator {
    public static void main(String[] args) {
        Addition add=new Addition();
        System.out.println("Addition: "+add.calculator(25,87));

        Multiplication ml=new Multiplication();
        System.out.println("Multiplication: "+ml.calculator(48,86));

        Substraction sb=new Substraction();
        System.out.println("Substraction: "+sb.calculator(58,77));

        Division dv=new Division();
        System.out.println("Division: "+dv.calculator(78,24));
    }
}
