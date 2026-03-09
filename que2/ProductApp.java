package que2;
import java.util.Scanner;
public class ProductApp {
    static void main(String[] args) {
        Scanner get= new Scanner(System.in);
        Product P1=new Product();

        System.out.print("enter the productId: ");
        P1.SetProductId(get.nextInt());
        System.out.print("Enter the Product Name: ");
        P1.SetProductName(get.next());
        System.out.print("Enter the this product price: ");
        P1.SetPrice(get.nextDouble());
        System.out.print("Enter the Product quantity: ");
        P1.SetQuantity(get.nextInt());

        System.out.println("===Final Product details are===");
        P1.displayDetails();
        System.out.print("\n Total Value of Stocking: ");
        P1.calculateTotalValue();
    }
}
