package DSA;

public class Programme005 {

    private String Name;
    private String RollNo;
    private int Age;

    //define getter
    public int getAge(){
        return Age;
    }

    public String getName(){
        return Name;
    }

    public String getRollNo(){
        return RollNo;
    }

    //setter
    public void setName(String name) {
        Name = name;
    }

    public void setRollNo(String rollNo) {
        RollNo = rollNo;
    }

    public void setAge(int age) {
        Age = age;
    }

    public static void main(String[] args) {
        //java encapsulation programme

        Programme005 pg=new Programme005();
        pg.setName("Amit");
        pg.setRollNo("22");
        pg.setAge(22);

        System.out.println("Student name is:-"+pg.getName());
        System.out.println("Student RollNo is:-"+pg.RollNo);
        System.out.println("Student Age is:-"+pg.getAge());

    }
}
