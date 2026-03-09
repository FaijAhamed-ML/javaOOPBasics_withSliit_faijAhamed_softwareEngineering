package que2;

public class Product {
    private int productId;
    private String productName;
    private double price;
    private int quantity;

    public void SetProductId(int productId){
        this.productId=productId;
    }
    public void SetProductName(String Name){
        this.productName=Name;
    }
    public void SetPrice(double Price){
        if (Price>0){
            this.price=Price;
        }else {
            System.out.println("Enter the Correct Price Value!!!");
        }
    }
    public void SetQuantity(int Quantity){
        if(Quantity>0){
            this.quantity=Quantity;
        }else {
            System.out.println("Enter the correct value of Quantity!!!");
        }
    }
    public int getProductId(){
        return productId;
    }
    public String getProductName(){
        return productName;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public void displayDetails(){
        System.out.println("product id is: "+productId);
        System.out.println("product name is: "+productId);
        System.out.println("Available Quantity is: "+quantity);
        System.out.println("the product Price is: "+price);
    }
    public double calculateTotalValue(){
        return price*quantity;
    }
}
