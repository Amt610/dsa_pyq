package CollectionFramework;
//Student management project using arraylist

import java.util.ArrayList;
import java.util.Scanner;

class Student{
    int id;
    String name;
    String email;

    //constructor
    Student(int cId,String cName,String cEmail){
        this.id=cId;
        this.name=cName;
        this.email=cEmail;
    }

    public String toString(){
        return id+"_"+name+"_"+email;
    }
}
public class ArrayListProject {
    public static void main(String[] args) {
        //define Scanner class
        Scanner sc=new Scanner(System.in);

        ArrayList<Student> arr=new ArrayList<>();

        //add student
        arr.add(new Student(1,"Amit","amit@gmail.com"));
        arr.add(new Student(2,"Akash","akash@gmail.com"));
        arr.add(new Student(3,"Rahul","rahul@gmail.com"));
        arr.add(new Student(4,"prakash","prakash@gmail.com"));

        System.out.println();
        System.out.println();
        System.out.println("Print all student");
        for(Student s:arr){
            System.out.println(s);
        }

        System.out.println();
        System.out.println();
        //Search Student
        System.out.print("Find Student by Id No : ");
        int search_id=sc.nextInt();
        for (Student s:arr){
            if (s.id==search_id){
                System.out.println("found : "+s);
            }
        }

        System.out.println();
        System.out.println();

        System.out.print("Enter id of Remove Student : ");
        int remove_id=sc.nextInt();
        arr.removeIf(s->s.id==remove_id);
        System.out.println("After Remove Student : "+arr);
    }
}
