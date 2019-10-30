import java.util.Scanner;

public class BMICalculator {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        double m, kg, bmi;

        System.out.print ( "Your heght in M: " );
        m = keyboard.nextDouble();

        System.out.print ( "Your weight in Kg: " );
        kg = keyboard.nextDouble();

        bmi = kg / (m*m);

        System.out.println ( "Your BMI is " + bmi );
    }
}