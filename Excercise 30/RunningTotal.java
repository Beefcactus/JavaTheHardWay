import java.util.Scanner;

public class RunningTotal { //public class "ProgramName"
    public static void main( String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int current, total = 0;

        System.out.print("Type in stuff and ill pop it in together. ");
        System.out.println("Ill stop when you type a zero");

        do {
            System.out.print("Value: ");
            current = keyboard.nextInt();
            total += current;
            System.out.println("Te total so far is: " + total);

        }
        while ( current != 0);

        System.out.println("The final total is: " + total);
    }
}