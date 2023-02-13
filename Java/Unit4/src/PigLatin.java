import java.util.Locale;

public class PigLatin {
    public static boolean isVowel(String word, int index) {
        if (word.charAt(index) == 'a' || word.charAt(index) == 'i' || word.charAt(index) == 'e'
                || word.charAt(index) == 'u' || word.charAt(index) == 'o') {
            return true;
        } else {
            return false;
        }
    }
    public static String translateWordToPigLatin(String word) {
        word=word.toLowerCase(Locale.ROOT);
        String output = "";
        int index = 0;
        boolean x = isVowel(word, 0);
        if (x == true) {
            output += word.substring(0) + "yay";
        }
        else{
            int i=0;
            while(x==false){
               x = isVowel(word,i+1);
                index = i+1;
                i++;
            }
            output=word.substring(index);
            output+= word.substring(0, index) + "ay";
        }
        return output;
    }
    public static String toPigLatin(String word){
        String output = "";
        String store= "";
        int lastIndex=-1;
        int index=0;
        final String toFind= " ";
        while(index!=-1){
            index= word.indexOf(toFind, index+1);
            if (index == -1) {
                store= word.substring(lastIndex+1);
                lastIndex= index;
                output+= translateWordToPigLatin(store);
            } else {
                store= word.substring(lastIndex+1, index);
                lastIndex= index;
                output+= translateWordToPigLatin(store) + " ";
            }
        }
        output= output.toUpperCase(Locale.ROOT).charAt(0) + output.substring(1);
        return output;
    }

}


