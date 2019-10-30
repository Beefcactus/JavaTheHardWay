import java.util.Scanner;

public class SpaceWeight {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int choice;
        double weight, Venus, Mars, Jupiter, Saturn, Uranus, Neptune;


        System.out.print( "Input your Earth weight: ");
        weight = keyboard.nextInt();

        Venus = ( weight * 0.78 );
        Mars = ( weight * 0.39);
        Jupiter = ( weight * 2.65);


        System.out.println( "1.Venus  2.Mars   3.Jupiter");
        System.out.println( "4.Saturn 5.Uranus 6.Neptune");

        System.out.print( "Which planet do you plan on visiting?");
        choice = keyboard.nextInt();

        if ( choice == 1 ) {
            System.out.println( "Your weight = " + Venus );
        }
        if ( choice == 2 ) {
            System.out.println( "Your weight = " + Mars);
        }



    }
}