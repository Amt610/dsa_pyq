package Constructor;

public class StartConstructor {
    public static void main(String[] args) {
        //Test java Getter, Setter and Constructor Programme
        Student st=new Student("Amit Yadav","ay3106222@gamil.com",1);
        Student st1=new Student("Akash Singh","akashew32@gmail.com",2);
        Student st2=new Student("Priya","priya2515@gmail.com",3);
        st.display();
        st1.display();
        st2.display();
    }
}

//create class
class Student{
    private String name;
    private String email;
    private int id;

    //Getter
    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public int getId(){
        return id;
    }


    //setter
    public void setName(String name){
        this.name=name;
    }
    public void setEmail(String email){
        this.email=email;
    }

    public void setId(int id){
        if (id>=0){
            this.id=id;
        }else {
            System.out.println("Id can't less than 1, Enter a valid Id ");
        }
    }

    //Constructor
    Student(String Cname,String Cemail,int Cid){
        name=Cname;
        email=Cemail;
        id=Cid;
    }

    void display(){
        System.out.println("Student Name: "+name);
        System.out.println("Student Email: "+email);
        System.out.println("Student Id: "+id);
    }
}