package GatterSetter;

class quantity{
    private String name;
    private int quantity;
    private int price;

    public String getName(){
        return name;
    }
    public int getQuantity(){
        return quantity;
    }

    public int getPrice(){
        return price;
    }

    public void setQuantity(int quantity){
        if (quantity>=0){
            this.quantity=quantity;
        }else {
            System.out.println("Quantity Can't be negative !");
        }
    }

    public void setPrice(int price) {
        if (price>=0){
            this.price=price;
        }else {
            System.out.println("Price can't be negative !");
        }
    }

    public void setName(String name){
        this.name=name;
    }
}
public class ProjectGatterSetter {
    public static void main(String[] args) {
        quantity qt=new quantity();
        qt.setName("Pen");
        qt.setQuantity(21);
        qt.setPrice(20);
        System.out.println("Product Name: "+qt.getName());
        System.out.println("Product Quantity: "+qt.getQuantity());
        System.out.println("Product Price: "+qt.getPrice());
        System.out.println("Total Amount: "+qt.getPrice()* qt.getQuantity());
    }
}
