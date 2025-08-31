package Inheritance;

class Parent{
    void show(){
        System.out.println("Parent Class Details....");
    }
}

class Child extends Parent{
    @Override
    void show(){
        System.out.println("Child Class details......");
    }
}

public class OverridingInherit {
    public static void main(String[] args) {
        //method overriding in java
        Parent pt=new Child();
        pt.show();
    }
}
