package GatterSetter;

class Employees{
    private String name;
    private int age;
    private int rollNo;
    private String fatherName;
    private String motherName;

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    public void setRollNo(int rollNo){
        this.rollNo=rollNo;
    }
    public int getRollNo(){
        return rollNo;
    }

    public void setFatherName(String fatherName){
        this.fatherName=fatherName;
    }

    public String getFatherName(){
        return fatherName;
    }

    public void setMotherName(String motherName){
        this.motherName=motherName;
    }

    public String getMotherName(){
        return motherName;
    }
}

public class BasicGetterSetter {
    public static void main(String[] args) {
        //Create Getter and Setter
        //Create set object
        Employees emp=new Employees();
        emp.setName("Amit Yadav");
        emp.setAge(21);
        emp.setRollNo(19);
        emp.setFatherName("Moti lal Yadav");
        emp.setMotherName("Manisha Devi");


        //print student details
        System.out.println("Employees Name: "+emp.getName());
        System.out.println("Employees Age: "+emp.getAge());
        System.out.println("Employee RollNo: "+emp.getRollNo());
        System.out.println("Employees Father's Name: "+emp.getFatherName());
        System.out.println("Employees Mother's Name: "+emp.getMotherName());
    }
}
