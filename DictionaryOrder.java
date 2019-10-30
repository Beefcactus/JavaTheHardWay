import java.util.Scanner;

public class DictionaryOrder {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner (System.in);
        String name;

        System.out.println( "Input a gender");
        name = keyboard.nextLine();

        if ( name.compareTo("Male") < 0)
            System.out.println( name + " Isnt real." );
        if ( name.compareTo("Male") == 0)
            System.out.println(" Male isnt a made up gender!" );
        if ( name.compareTo("Male") > 0)
            System.out.println( name + " Isnt real." );

        if ( name.compareTo("Female") < 0)
            System.out.println( name + " Isnt real." );
        if ( name.compareTo("Female") == 0)
            System.out.println( " Female isnt a made up gender! " );
        if ( name.compareTo("Female") > 0)
            System.out.println( name + " Isnt real." );

        if ( name.compareTo("AttackHelicopter") < 0)
            System.out.println( name + " Isnt real." );
        if ( name.compareTo("AttackHelicopter") == 0)
            System.out.println( " Attack Helicopter isnt a made up gender! " );
        if ( name.compareTo("AttackHelicopter") > 0)
            System.out.println( name + " Isnt real." );
    }
}