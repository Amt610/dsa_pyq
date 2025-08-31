package Inheritance;

//java inheritance
class Shape{
    void draw(){
        System.out.println("Drawing shape...");
    }
}

class Square extends Shape{
    void area(){
        System.out.println("Area of Square:a*a");
    }
}

class Circle extends Shape{
    void area(){
        System.out.println("Area of Circle: 3.14*r*r");
    }
}

public class HierarchicalInherit {
    public static void main(String[] args) {
        //Access java Class
        Square sq=new Square();
        sq.area();
        sq.draw();

        //second class of java
        Circle cr=new Circle();
        cr.area();
        cr.draw();
    }
}
