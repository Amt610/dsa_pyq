package Constructor;

public class DefaultConstructor {
    public static void main(String[] args) {
        //Default Constructor
        car cr1=new car("Splendor","Spl1000",2021);
        car cr2=new car("Thar","thar225",2023);
        car cr3=new car("Fortuner","fortuner23",2023);
        cr1.display();
        cr2.display();
        cr3.display();
    }
}

class car{
    private String carName;
    private String modelNo;
    private int lunchYear;


    //Getter
    public String getCarName(){
        return carName;
    }

    public String getModelNo(){
        return modelNo;
    }

    public int getLunchYear(){
        return lunchYear;
    }


    //setter
    public void setCarName(String carName){
        this.carName=carName;
    }

    public void setModelNo(String modelNo){
        this.modelNo=modelNo;
    }

    public void setLunchYear(int lunchYear){
        this.lunchYear=lunchYear;
    }

    //Constructor
    car(String xCarName,String xModelNo,int xLunchYear){
        carName=xCarName;
        modelNo=xModelNo;
        lunchYear=xLunchYear;
    }


    //print details
    void display(){
        System.out.println("Car Name: "+carName);
        System.out.println("Car Model No: "+modelNo);
        System.out.println("Car Lunch Year: "+lunchYear);
    }
}
