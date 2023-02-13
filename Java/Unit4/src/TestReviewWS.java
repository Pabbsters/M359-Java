import java.util.Scanner;
public class TestReviewWS {
    public void doubleChar(String str) {
        String output = " ";
        for (int i = 0; i < str.length(); i++) {
            output=output+str.charAt(i)+str.charAt(i);
        }
        System.out.println(output);
    }
    public void repeatFront(String str, int n){
        while(n>=0 && n<= str.length()){
            System.out.print(str.substring(0,n));
            n--;
        }
    }
    public void loop(String str){
        System.out.println();
        for(int i=0; i< str.length(); i++){
            System.out.println(str.charAt(i));
        }
    }
    public void reverseRemove(String str){
        int len=str.length();
        for(int i=len-1;i>=0;i-=2){
            System.out.print(str.charAt(i));
        }
    }
    public void removeChar(String str, char c){
        String output= " ";
        for (int i=0; i<str.length(); i++){
            if(!(str.charAt(i) ==c)){
                output+= str.charAt(i);
            }
        }
        System.out.print(output);
    }
    public void loop1() {
        String str = "HocusPocus";
        String output = "";
        System.out.println();
        for (int i = 0; i < str.length(); i += 2) {
            output+=str.substring(i, i + 2);
            System.out.println(output);
        }
    }
    public static String buildPhrase(){
        String str = " ";
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the first word of your phrase (-1 to quit):");
        String word= input.nextLine();
        while(!word.equals("-1")){
            //System.out.print(word);
            str= str+" "+ word;
            System.out.println("Enter the next word of your phrase(-1 to quit");
            word=input.nextLine();
        }
        return str;
    }
    public void nest(){
        String output= " ";
        int lines=5;
        for (int i=1; i<=lines; i++){
            for(int j=1; j<=1; j++){
                System.out.print(i*j + "\t");
            }
            System.out.println();
        }
    }
    public void findFactors(int s){
        for (int i=s; i>0; i--){
            if((s % i)== 0){
                System.out.print( i +" ");
            }
        }
    }

    public static void main(String[] args) {
        TestReviewWS s = new TestReviewWS();

        s.doubleChar("The");
        s.doubleChar("AAbb");
        s.doubleChar("Hi-There");

        s.repeatFront("Chocolate",4);

        s.loop("Hello");
        s.reverseRemove("Program");
        s.removeChar("Program", 'm');

        s.loop1();
        s.findFactors(40);
        String newStr=s.buildPhrase();
        System.out.println(newStr);
    }
}

