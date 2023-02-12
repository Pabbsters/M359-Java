
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.Math;

public class TriviaGame {
      private TriviaQuestion[] myQuestions;
      private String answerChoice;
      private double percentageGained;
      private int correctAnswers;
      private int totalPoints;
      private int incorrectAnswers;
      private int currentsteakPoints;
      private boolean[] boolArray ;

    public TriviaGame(){
        answerChoice="";
        percentageGained=0.0;
        correctAnswers=0;
        incorrectAnswers=0;
        currentsteakPoints=0;
        myQuestions= new TriviaQuestion[12];
        boolArray=new boolean[12];
    }
    /**
     *
     * @return
     * @throws FileNotFoundException
     */
      public int readFile() throws FileNotFoundException {
          File myFile = new File("D:\\Java\\Unit6\\HistoryQuestions.txt");
          Scanner scan = new Scanner(myFile);
          for (int x = 0; x < myQuestions.length; x++) {
              if (scan.hasNextLine()) {
                  String question = scan.nextLine();
                  String firstAnswer = scan.nextLine();
                  String secondAnswer = scan.nextLine();
                  String thirdAnswer = scan.nextLine();
                  String fourthAnswer = scan.nextLine();
                  String questionPoints=scan.nextLine();
                  answerChoice = scan.nextLine();

                  myQuestions[x] = new TriviaQuestion(question, firstAnswer, secondAnswer, thirdAnswer, fourthAnswer, questionPoints,answerChoice);
                  }
          }
          return myQuestions.length;
          }

    /**
     *
     */
    public void playGame() {

         int rand = (int) (Math.random() * myQuestions.length);
         if (!boolArray[rand]) {
             boolArray[rand] = true;
             System.out.println(myQuestions[rand].toString());
             System.out.println("Enter Your Answer: ");
             Scanner sc = new Scanner(System.in);
             String str1 = sc.nextLine();
             System.out.print("Answer:  " + str1);
             System.out.println();

             if (str1.equalsIgnoreCase(myQuestions[rand].getAnswer())) {
                 System.out.println("you got it Right- CONGRATS!!!!!");
                 correctAnswers++;
                 currentsteakPoints++;
                 totalPoints += Integer.parseInt(myQuestions[rand].getQuestionPoints());
                 displayOutput();
             } else {
                 System.out.println("you got it wrong- CORRECT Answer is: " + myQuestions[rand].getAnswer());
                 incorrectAnswers++;
                 currentsteakPoints = 0;
                 displayOutput();
             }

         }
         else playGame();
     }

    /**
     *
     */
    public void displayOutput () {
              System.out.println("Correct Answers: " + correctAnswers);
              System.out.println("InCorrect Answers: " + incorrectAnswers);
              System.out.println("Points Earned: " + totalPoints);
              System.out.println("Current Steak: " + currentsteakPoints);
          }

    /**
     *
     */
    public void displayFinal () {
              percentageGained= (double)(correctAnswers*100)/(incorrectAnswers+correctAnswers);
              System.out.println("Correct Answers: " +"\t"+  correctAnswers);
              System.out.println("InCorrect Answers: " + "\t" + incorrectAnswers);
              System.out.println("Points Earned: " + "\t" + totalPoints);
              System.out.println("Percentage of questions answered correctly:  "+ "\t" + String.format("%.2f", percentageGained));
          }
      }








