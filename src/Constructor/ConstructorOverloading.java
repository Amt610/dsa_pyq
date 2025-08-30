package Constructor;

//create java class
class details{
    private String name;
    private String email;
    private int age;

    //getter
    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public int getAge(){
        return age;
    }

    //setter
    public void setName(String name){
        this.name=name;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public void setAge(int age){
        if (age>0){
            this.age=age;
        }else {
            System.out.println("Age Can't be negative: "+age);
        }
    }


    //constructor
    details(String cName,String cEmail,int cAge){
        name=cName;
        email=cEmail;
        age=cAge;
    }


    //Overloading Constructor 1
    details(String cName,String cEmail){
        name=cName;
        email=cEmail;
        age=21;
    }

    //Overloading Constructor 2
    details(String cName,int cAge){
        name=cName;
        email="ay312000@gmail.com";
        age=cAge;
    }

    //display data
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Email : "+email);
        System.out.println("Age : "+age);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        //java constructor overloading
        details dls=new details("Amit Yadav","ay3106222@gmail.com",35);
        dls.display();

        System.out.println(" ");
        System.out.println("Constructor Overloading 01");
        details dls1=new details("Akash Yadav",21);
        dls1.display();

        System.out.println(" ");
        System.out.println("Constructor Overloading 02");
        details dls2=new details("Rahul Kumar","Rahulku656@gmail.com");
        dls2.display();
    }
}
