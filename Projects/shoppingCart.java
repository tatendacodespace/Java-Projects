// This is a shopping cart application where users enter the item they want to buy
// How many units of that item they want 
// and the price for each item
// and the application will display what the user bought and the total price of the item
// The price is calculated using the quantity and price
package Projects;

import java.util.Scanner;

public class shoppingCart{
    public static void main(String[] args) {
        
        //Shopping Cart Program
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = 'R';
        double total;

        System.out.println("What item would you like to buy?: ");
        item = scanner.nextLine();
        System.out.println("What is the price for each?: ");
        price = scanner.nextDouble();
        System.out.println("How many would you like?: ");
        quantity = scanner.nextInt();

        total = price * quantity;
        System.out.println();

        System.out.println("You have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is " + currency + total);



        scanner.close();
    }
}