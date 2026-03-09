package que01;

import java.util.Scanner;
public class BankApp {
    static void main(String[] args) {
        Scanner get=new Scanner(System.in);
        SavingsAccount Holder1= new SavingsAccount();

        System.out.print("Enter Account Number: ");
        Holder1.setAccountNumber(get.nextInt());
        System.out.print("Enter the Account Holder Name: ");
        Holder1.setAccountHolder(get.nextLine());

        System.out.print("Enter initial Deposit: ");
        double deposit=get.nextDouble();
        Holder1.deposit(deposit);
        System.out.println("Deposited "+deposit+" New Balance"+Holder1.GetAccountBalance());

        System.out.print("Enter Deposit Amount: ");
        double deposit1=get.nextDouble();
        Holder1.deposit(deposit1);
        System.out.println("Deposited "+deposit1+" New Balance"+Holder1.GetAccountBalance());

        System.out.print("Enter withdrawal Amount: ");
        double withdraw=get.nextDouble();
        Holder1.withdraw(withdraw);
        System.out.println("Withdrawn"+withdraw+" New Balance"+Holder1.GetAccountBalance());

        System.out.println("\nFinal Account Details:");
        Holder1.displayAccountDetails();
    }
}
