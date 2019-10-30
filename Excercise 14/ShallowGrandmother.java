import java.util.Scanner;

public class ShallowGrandmother {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        int age;
        double income, cute;
        boolean allowed;

        System.out.print( "Enter your age: " );
        age = keyboard.nextInt();

        System.out.print( "Enter your yearly income: " );
        income = keyboard.nextDouble();

        System.out.print( "How cute are you on a scale from 0.0 to 10.00? " );
        cute = keyboard.nextDouble();

        allowed = (age >= 21 && age <= 35 && (income > 60000 || cute >= 7.5 ) );

        System.out.println( "Allowed to date my sister? " + allowed );
    }
}