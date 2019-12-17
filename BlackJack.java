import java.util.Scanner;

public class BlackJack {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);

        String hand[]=new String[num];
        Random randomGenerator=new Random();
        int card[]=new int [num];
        int num=Integer.parseInt(JOptionPane.showInputDialog("Welcome, are you prepared to go broke?"));
        int card2[]=new int [num];
        int mb=0, mp=0;
        for(int x=0;x<=num;x++){
            int RandNum=randomGenerator.nextInt(10)+1;
            card[x]=RandNum;
            RandNum=randomGenerator.nextInt(10)+1;
            card2[x]=RandNum;
            if(card[x]+card2[x]>16){
                hand[x]="Good";
                mb=mb+1;
            }
            else{
                hand[x]="Bad";
            }
            if(card[x] + card2[x]==21){
                hand[x]="Perfect";
                mp=mp+1;
            }
            System.out.println("your primary card IS " + card[x] + "\nand your secondary card is " + card2[x] + "\nyou have a total of" + (card[x] + card2[x]) + "\nwhat converts your hand and a hand  " +hand[x] );
        }
        System.out.println("They were " + mb + " Good Hands and " + mp + "Perfect Hands" );

        
    }
}

