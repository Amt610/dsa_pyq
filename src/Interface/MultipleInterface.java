package Interface;

//multiple interface programme
interface dog{
    void bark();
}

interface cat{
    void eat();
}

class Animals implements dog,cat{
    @Override
    public void eat() {
        System.out.println("Eating.....");
    }

    @Override
    public void bark() {
        System.out.println("Barking.....");
    }
}

public class MultipleInterface {
    public static void main(String[] args) {
        Animals an=new Animals();
        an.bark();
        an.eat();
    }
}
