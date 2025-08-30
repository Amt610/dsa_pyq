package Inheritance;

//Java Single inherit programme
class Parents{
    void eat(){
        System.out.println("Parent is Eating ");
    }
}

class child extends Parents{
    void play(){
        System.out.println("Child is playing");
    }
}

public class SingleInherit {
    public static void main(String[] args) {
        //Display output using object of class
        child bb=new child();
        bb.play();
        bb.eat();
    }
}
