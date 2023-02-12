import java.io.File;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class TriviaQuestion {
    private String question;
    private String firstAnswer;
    private String secondAnswer;
    private String thirdAnswer;
    private String fourthAnswer;
    private String questionPoints;
    private String answer;


    public TriviaQuestion(String question, String firstAnswer,String secondAnswer,String thirdAnswer,String fourthAnswer, String questionPoints,String answerChoice) {
        this.question = question;
        this.firstAnswer=firstAnswer;
        this.secondAnswer=secondAnswer;
        this.thirdAnswer=thirdAnswer;
        this.fourthAnswer=fourthAnswer;
        this.questionPoints=questionPoints;
        this.answer= answerChoice;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getFirstAnswer() {
        return firstAnswer;
    }

    public void setFirstAnswer(String firstAnswer) {
        this.firstAnswer = firstAnswer;
    }

    public String getSecondAnswer() {
        return secondAnswer;
    }

    public void setSecondAnswer(String secondAnswer) {
        this.secondAnswer = secondAnswer;
    }

    public String getThirdAnswer() {
        return thirdAnswer;
    }

    public void setThirdAnswer(String thirdAnswer) {
        this.thirdAnswer = thirdAnswer;
    }

    public String getFourthAnswer() {
        return fourthAnswer;
    }

    public void setFourthAnswer(String fourthAnswer) {
        this.fourthAnswer = fourthAnswer;
    }
    public String getQuestionPoints() {
        return questionPoints;
    }
    public void setQuestionPoints(String questionPoints) {
        this.questionPoints = questionPoints;
    }
    public String getAnswer() {
        return answer;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    /**
     *
     * @return
     */
    public String toString() {
        String print=question+ "\t"+"\t"+  "(" + questionPoints  + "points)" + "\n";
        print+=firstAnswer +"\n"+ secondAnswer + "\n" +thirdAnswer + "\n"+ fourthAnswer + "\n";
        return print;

    }
}
