import java.util.Scanner;

public class CoinFlip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numTails = 0;
        int numHeads = 0;
        System.out.print("What are we playing up to: ");
        int numWin = input.nextInt();

        while(numTails != numWin && numHeads != numWin){
            Coin t = new Coin();
            if(t.isHeads()){
                System.out.println("Heads");
                numHeads++;
            }
            else {
                System.out.println("Tails");
                numTails++;
            }
        }
        {
            if(numHeads == 10){
                System.out.println("HEADS WINS!!!");
            }
            else if(numTails == 10){
                System.out.println("TAILS WINS!!!");
            }
            System.out.println("Heads: " + numHeads + "\n" + "Tails: "+ numTails);
        }
    }
}
