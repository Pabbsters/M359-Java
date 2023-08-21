import java.util.Scanner;

public class Factorial {
    private static int value;
    public static void main(String[] args) {
        int num;
        int answer;
        Scanner scan = new Scanner(System.in);
        System.out.print("Welcome to the factorial program! ");
        num = scan.nextInt();
        answer= factorial(num);


    }
        public static int factorial(int num){
        System.out.print(num);
            if (num > 0) {
                value = num * factorial(num - 1);
            }
                return value;
            }
        }

