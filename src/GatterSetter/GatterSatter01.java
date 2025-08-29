package GatterSetter;

class student{
    private String name;
    private int age;
    private int RollNo;

    public String getName(){
        return name;
//        System.out.println(name);
    }
    public int getAge(){
        return age;
    }

    public int getRollNo(){
        return RollNo;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public void setRollNo(int RollNo){
        this.RollNo=RollNo;
    }
}

public class GatterSatter01 {
    public static void main(String[] args) {
        //Practice on gatter and satter
        student st=new student();

        
        st.setRollNo(24);
        st.setAge(21);
        st.setName("Amit Yadav");
        System.out.println(st.getAge());
        System.out.println(st.getName());
        System.out.println(st.getRollNo());

    }
}
