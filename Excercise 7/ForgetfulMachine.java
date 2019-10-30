import java.util.Scanner;

public class ForgetfulMachine {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println( "Do you like beans?" );
        keyboard.next();

        System.out.println( "Where do you keep your spaghettios" );
        keyboard.nextInt();

        System.out.println( "Tell me the truth >:c" );
        keyboard.nextDouble();

        System.out.println( "They better be in there" );
        keyboard.next();
    }
}