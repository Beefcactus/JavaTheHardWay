import java.util.Scanner;

public class SafeSquareRoot { //public class "ProgramName"
    public static void main( String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double x, y;

        System.out.print("Give number to square root");
        System.out.print("(No negatives or youre gay) ");
        x = keyboard.nextDouble();

        while ( x < 0 ) {
            System.out.println("I said no negatives gay");
            System.out.print("\nNew number: ");
            x = keyboard.nextDouble();

        }

        y = Math.sqrt(x);

        System.out.println("The square root of " +x+ " is " +y);
    }
}