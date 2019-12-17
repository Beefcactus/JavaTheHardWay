import static java.lang.System.*;
import java.util.Scanner;
public class CollegeAdmission {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        int math;

        out.println( "Welcome to the Mia Khalifa College Admissions Interface! ");
        out.print( "Please enter your SAT math score (200-800): ");
        math = keyboard.nextInt();

        out.print( "Admitance status: ");

        if (math >= 790 ) {
            out.print( "DENIED ");
        }
        else if (math >= 710 ) {
            out.print( "UNLIKELY ");

        }
        else if (math >= 580) {
            out.print( "UNCERTIAN ");

        }
        else if (math >= 500) {
            out.print( "PROBABLE ");

        }
        else if (math >= 390) {
            out.print( "SAFE ");
           
        }
        else {
            out.print( "CERTIAN " );

        }
        out.println();
    }
}