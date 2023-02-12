public class StringAlgorithms {
    public static void main(String[] args) {

        // PART I
        String mySchool = "Fremd Vikings";

        // print every other character of mySchool on the same line
        for(int i= 0; i< mySchool.length(); i+=2 ){
            System.out.println(mySchool.charAt(i) + " ");
        }

        System.out.print("\n");


        // print the String mySchool in reverse (all characters on the same line)
        for(int i= mySchool.length(); i>0; i--){
            System.out.println(mySchool.charAt(i-1));
        }




         /* PART II
           Given the String animal, print the output such that the first line shows
           the first character, the second line shows the second character, and so on

           Ex:  If animal = "monkey" then the output would be:
               m
               mo
               mon
               monk
               monke
               monkey
        */
            String animal= "monkey";
            for(int i=0; i<animal.length()+1;i++){
                System.out.println(animal.substring(0,i));
            }





        // PART III
        String phrase = "Mary had a little lamb, little lamb, little lamb ";
        phrase += "Mary had a little lamb, its fleece was white as snow";

        // Print the amount of times the word "little" appears within phrase?


        // create a new String, or modify the existing String, that removes
        // the word "little" entirely





        // create a new String (based on phrase), or modify the existing String,
        // that replaces the word "little" with the word "BIG"
        int count=0;
        while(phrase.indexOf("little") !=-1){
            if(phrase.indexOf("little") !=-1){
                int index= phrase.indexOf("little");
                int length= phrase.length();
                String p1= phrase.substring(0,index-1);
                String p2= phrase.substring(index+6, length);
                phrase= p1 + " BIG" + p2;
                count += 1;
            }
        }
        System.out.println(count);
        System.out.println(phrase);





    }
}
