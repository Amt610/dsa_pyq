package Constructor;


//Create brand class
class Brand{
    private String brands;
    private int price;

    //getter
    public String getBrands(){
        return brands;
    }

    public int getPrice(){
        return price;
    }

    //setter
    public void setBrands(String brands){
        this.brands=brands;
    }

    public void setPrice(int price){
        this.price=price;
    }

    Brand(String cBrands,int cPrice){
        this.brands=cBrands;
        this.price=cPrice;
    }

    Brand(String cBrands){
        this(cBrands,3000);
    }

    Brand(int cPrice){
        this("Mahindra",cPrice);
    }

    Brand(){
        this("BMW",1000000);
    }

    void display(){
        System.out.println("Brand Name : "+brands);
        System.out.println("Price list : "+price);
    }
}
public class ThisConstructor {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Constructor get default data");
        Brand b1=new Brand();
        b1.display();

        System.out.println(" ");
        System.out.println("pass only brands name");
        Brand b2=new Brand("Tractor");
        b2.display();

        System.out.println(" ");
        System.out.println("pass only price data");
        Brand b3=new Brand(321654);
        b3.display();
    }
}
