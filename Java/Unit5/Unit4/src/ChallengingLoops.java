public class ChallengingLoops {
    public static void everyOtherWordBackwards() {
        String str = "Boy these loops are tricky!";
        String strWords[] = str.split(" ");
        String newString = " ";
        for (int i = 0; i < strWords.length; i++) {
            String strWord = strWords[i];
            String newWord = " ";
            for (int j = strWord.length() - 1; j >= 0; j--) {
                newWord += strWord.charAt(j);
            }
            newString = newString + newWord + " ";
        }
        System.out.println(newString);
    }

    public static void everyOtherLetterPyramid(String str) {
        System.out.println(str);
        while (str.length() > 1) {
            String out = "";
            for (int i = 0; i < str.length(); i += 2) {
                out = out + str.charAt(i);
            }
            System.out.println(out);
            str = out;
        }
    }

    public static void main(String[] args) {
        ChallengingLoops c = new ChallengingLoops();
       c.everyOtherWordBackwards();
       c.everyOtherLetterPyramid("FremdVikings");
        int n = 5;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
            n = n - 1;
        }

        for (int i = 5; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

