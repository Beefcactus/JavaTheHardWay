import java.util.Scanner;

public class ThereAndBackAgain { //public class "ProgramName"
    public static void main( String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println( "Here." );
        erebor();
        System.out.println( "Back first time'" );
        erebor();
        System.out.println( "Back second time." );
    }

    public static void erebor() {
        System.out.println( "There." );
    }
}