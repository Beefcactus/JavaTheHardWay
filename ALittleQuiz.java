import java.util.Scanner;

public class ALittleQuiz {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);

        String ans = "yes", guess1, guess2, guess3;
        String ofm = "maybe";


        //(ans.toLowerCase() == "yes" )//

        System.out.print( "What is 1643 + 85630? " );
        guess1 = keyboard.next();

        if (guess1.toLowerCase().equals(ans) ) {
            System.out.println( "Correct! " );
        }

        else if (guess1.toLowerCase().equals(ofm)) {
            System.out.println( "Haha. youre very funny. " );
        }

        else if (guess1.toLowerCase().equals("87273")) {

            System.out.println( "Ok smartie " )
        }

        else {
            System.out.println( "Wrong, the answer isnt " + guess1 + "... " );
        }

        

        System.out.print( "How old am i? ");
        guess2 = keyboard.next();

        if (guess2.toLowerCase().equals(ans) ) {
            System.out.println( "Correct! " );
        }

        else if (guess2.toLowerCase().equals(ofm)) {
            System.out.println( "No. Stop. " );
        }

        else if (guess2.toLowerCase().equals("17")) {
            System.out.println( "How the hell..." );
        }

        else {
            System.out.println( "Wrong, the answer isnt " + guess2 + "... " );
        }
    

        System.out.print( "Where'd my dad go? ");
        guess3 = keyboard.next();

        if (guess3.toLowerCase().equals(ans) ) {
            System.out.println( " ...What do you mean 'yes'? " );
        }

        else if (guess3.toLowerCase().equals("store")) {
            System.out.println( "Oh hes just at the store? okay! " );
        }

        else if (guess3.toLowerCase().equals(ofm)) {
            System.out.println( "God has a special place in hell for you. ");
        }

        else {
            System.out.println( "Oh so he's gone... " );
        }

        System.out.println( "Thanks for nothing! " );

    }
}