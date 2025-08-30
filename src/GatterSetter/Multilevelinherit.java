package GatterSetter;

//inheritance multilevel programme
class College{
    void collegeDisplay(){
        System.out.println("College.com started....");
    }
}

class Course extends College{
//    @Override;
    void chooseCourse(){
        System.out.println("You Can choose Course......");
    }
}


class Result extends Course{
//    @Override
    void result(){
        System.out.println("You can see result.com......");
    }
}

public class Multilevelinherit {
    public static void main(String[] args) {
        // Parent Class
        College clg=new College();
        clg.collegeDisplay();
        System.out.println(" ");

        Result rs=new Result();
        rs.collegeDisplay();
        rs.chooseCourse();
        rs.result();
    }
}
