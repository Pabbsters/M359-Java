import java.util.Scanner;
public class Practice {
    public String convertName(String name){
        String fName= name.substring(0,name.indexOf(" "));
        String lName= name.substring(name.indexOf(" ")+1);
        String cName= lName +", "+ fName;
        return cName;
    }
    public static void main(String [] args){
        Scanner input= new Scanner(System.in);
        Practice p=new Practice();
        System.out.println("Enter the Name: ");
        String fullName= input.nextLine();
        String finalName=p.convertName(fullName);
        System.out.println(finalName);
        System.out.println("Please enter a phrase:");
        String phrase1= input.nextLine();
        System.out.println("What character number do you want:");
        int num= input.nextInt();
        System.out.println("Character " + num + " is: " +phrase1.charAt(num));

        System.out.println("Please enter a phrase:");
        String phrase2=input.nextLine();
        phrase2= input.nextLine();
        System.out.println("Comparing the two strings " + phrase1.compareTo(phrase2));
        System.out.println("Concatenating the two strings " + phrase1+" " +phrase2);
        System.out.println("Two strings are not equal(case sensitive) " + phrase1.equals(phrase2));
        System.out.println("Two strings are not equal(ignoring cases) " + phrase1.equalsIgnoreCase(phrase2));
        System.out.println("What letter are you looking for in the first phrase: ");
        char c1=input.next().charAt(0);
        System.out.println(c1 + " first occurs at:  " + phrase1.indexOf(c1));
        System.out.println("What letter do you want replaced with the letter x:  ");
        System.out.println("The new phrase is " + phrase1.replace(input.next(),"x"));
        System.out.println("What substring do you want: ");
        System.out.println("Sub String Returned: " + phrase1.substring(input.nextInt(),input.nextInt()));
        System.out.println("Starting at what number do you want to start a substring that goes to the end of the phrase:  ");
        System.out.println(phrase1.substring(input.nextInt()));
        System.out.println(phrase1.toLowerCase());
        System.out.println(phrase1.toUpperCase());
        }

}

