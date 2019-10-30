import java.util.Scanner;
public class WeaselOrNot {
    public static void main( String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String word;
        boolean yep, nope;

        System.out.println( "Please type Weasel" );
        word = keyboard.next();

        yep =    word.equals("weasel");
        nope = ! word.equals("weasel");

        System.out.println( "youre an obedient one: " + yep);
        System.out.println( "youre headed to the gulag: " + nope );
    }
}