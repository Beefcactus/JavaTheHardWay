import java.util.Scanner;

public class HeronsFormula { //public class "ProgramName"
    public static void main( String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double a, g;
        String tws = "A triangle with sides ";

        a = triangleArea( 3, 3, 3);
        System.out.println("A triangle with sides 3,3,3 has area " + a);

        a = triangleArea(3, 4, 5);
        System.out.println("A triangle with sides 3,4,5 has area " + a);
        g = triangleArea(7, 8, 9);
        System.out.println(tws + "7,8,9 has area " + g );

        System.out.println(tws + "5,12,13 has area " + triangleArea(5, 12, 13) );
        System.out.println(tws + "10,9,11 has area " + triangleArea(10, 9, 11) );
        System.out.println(tws + "8,15,17 has area " + triangleArea())

    }
}