package bank.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

     Locale.setDefault(Locale.US);
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter account number: ");
     int accountNumber = sc.nextInt();
     System.out.print("Enter account holder: ");
     String accountHolder = sc.next();
     sc.nextLine();
     System.out.print("Is there na initial deposit (y/n)? ");
     char initialDeposit = sc.next().charAt(0);
     double depositValue = 0;

     if  (initialDeposit == 'y') {
        System.out.print("Enter initial deposit value: ");
        depositValue = sc.nextDouble();
     }

     System.out.println("");
     System.out.println("Account data: ");
     System.out.printf("Account "+ accountNumber + ", Holder: " + accountHolder + ", Balance: $ %.2f%n", depositValue);
     System.out.println("");
     System.out.print("Enter a deposit value: ");
     depositValue += sc.nextDouble();
     System.out.println("Updated account data: ");
     System.out.printf("Account "+ accountNumber + ", Holder: " + accountHolder + ", Balance: $ %.2f%n", depositValue);
     System.out.println("");
     System.out.print("Enter a withdrawal value: ");
     depositValue -= sc.nextDouble();
     System.out.println("");
     System.out.println("Updated account data: ");
     System.out.printf("Account "+ accountNumber + ", Holder: " + accountHolder + ", Balance: $ %.2f%n", depositValue);


    }
}
