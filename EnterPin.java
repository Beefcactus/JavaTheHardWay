import java.util.Scanner;

public class EnterPin{
    public static void main( String [] args) {
        Scanner keyboard = new Scanner(System.in);
        int pin, entry;

        pin = 12345; 

        System.out.println("WELCOME TO THE BANK OF COOCH");
        System.out.print("ENTER YOUR PIN: ");
        entry = keyboard.nextInt();

        while ( entry != pin ) {
            System.out.println("\nINCORRECT PIN> TRY AGAIN.");
            System.out.print("ENTER YOUR PIN: ");
            entry = keyboard.nextInt();

        }

        System.out.println("\nPIN ACCEPTED. YOUR COOCH BALANCE IS 0.00");
    }
}