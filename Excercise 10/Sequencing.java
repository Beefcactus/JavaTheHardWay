import java.util.Scanner;

public class Sequencing {
    public static void main( String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double price = 0, salesTax, total;

        System.out.print ( "How much is the purchase price? " );
        price = keyboard.nextDouble();

        salesTax = price * .0825;
        total = price + salesTax;

        System.out.println ( "Item price: " + price );
        System.out.println ( "Sales Tax: " + salesTax );
        System.out.println ( "Total Cost: " + total );

    }
}