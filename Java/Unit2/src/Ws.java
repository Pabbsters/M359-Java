// Name= Ruthwik Pabbu, Teacher Name= DeStephano, Class Period= 2
import java.util.Scanner;
public class Ws {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter x1: ");
        int x1= input.nextInt();
        System.out.println("Enter y1: ");
        int y1= input.nextInt();
        System.out.println("Enter x2: ");
        int x2= input.nextInt();
        System.out.println("Enter y2: ");
        int y2= input.nextInt();
        int x=x2-x1;
        int y=y2-y1;
        System.out.println(x);
        System.out.println(y);
        double distance= Math.sqrt((x*x)+(y*y));
        System.out.println("The distance between ("+ x1 +","+y1+") and ("+x2+","+y2+") is " + distance );
        System.out.println("Enter the max: ");
        int max= input.nextInt();
        System.out.println("Enter the min: ");
        int min= input.nextInt();
        int randomNum= (int) (Math.random()*max-min+1)+min;
        System.out.println("A random generated num is " + randomNum);
        double absValue= Math.abs(-3.7);
        System.out.println("The Absolute value is:  " + absValue);
        double powValue= Math.pow(x2-x1, 2);
        System.out.println("The Power value is: " + powValue);
        int maxValue= Math.max(x1,y1);
        System.out.println("The Max value is: " + maxValue);
        int minValue= Math.min(x2,y2);
        System.out.println("The Min Value is: " + minValue);
    }
}