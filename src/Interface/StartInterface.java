package Interface;

//java interface programme
//define interface programme in animals
interface animals{
    void eat();
}

class Dogs implements animals{
    public void eat(){
        System.out.println("Eating Foods....");
    }
}
public class StartInterface {
    public static void main(String[] args) {
        //Access Class of interface programme
        Dogs d=new Dogs();
        d.eat();
    }
}
