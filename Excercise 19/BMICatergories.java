import java.util.Scanner;

public class BMICatergories {
    public static void ain( String[] args) {
        Scanner keyoard = new Scanner(System.in);
        double bmi;

        System.out.print( "Enter your BMI  " );
        bmi = keyboard.nextDouble();

        System.out.print( "" );
        if ( bmi < 15.0 ) {
            System.out.println( "Broog's vegan ex Isaiah" );

        }

        else if ( bmi < 16.0 ) {
            System.out.println( "Spooky scary skeletons..." );
        }

        else if ( bmi < 18.5 ) {
            System.out.println( "Everyone must tell you to eat more" );
        }

        else if ( bmi < 25.0 ) {
            System.out.println( "Youre as regular as a white girl getting a pumpin spice at starbucks in november" );
        }
        else if ( bmi < 30.00 ) {
            System.out.println( "Dad bod gang" );
        }

        else if ( bmi < 35.00 ) {
            System.out.println( "Gettin a bit tubby there" );

        }

        else if ( bmi < 40.00 ) {
            System.out.println( "Biggie Cheese" );

        }

        else {
            System.out.println( "Holy heck... put you on a rope and i could take out the pentagon");
        }
    }
}