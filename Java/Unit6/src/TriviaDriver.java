import java.io.FileNotFoundException;
import java.util.Scanner;


public class TriviaDriver {
    /**
     *
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        TriviaGame triviaGame = new TriviaGame();
        System.out.println("What is your Name:  ");
        Scanner name = new Scanner(System.in);
        System.out.println("Hello"+ "  " +name.nextLine()+ "  WELCOME TO TRIVIA GAME-GOOD LUCK!!!!");
        System.out.println("**********************************************************");
        System.out.println();
        System.out.println("Please answer the following questions and check how much you score!!!!!!!!");
        System.out.println();
        int count=triviaGame.readFile();
        int indexValue=0;
        String str= "YES";

         while(str.equalsIgnoreCase("yes") && indexValue < count){
                    triviaGame.playGame();
                    System.out.println("Do you want to continue: (YES/NO) ");
                    Scanner scan = new Scanner(System.in);
                    str = scan.nextLine();
                    indexValue++;
                }

        if(str.equalsIgnoreCase("NO") || (indexValue>= count)) {

            System.out.println("******GAME ENDED*********");
            System.out.println("Please check your SCORE!!!!");
            System.out.println("_________________________");
            triviaGame.displayFinal();
        }
    }
}