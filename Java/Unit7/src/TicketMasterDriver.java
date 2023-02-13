import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class TicketMasterDriver {
    /**
     *
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        TicketMaster t = new TicketMaster();
        t.readFile();
        System.out.println(" Choose Menu Choices 1-6");
        System.out.println(" 1: Sort A-Z \n 2: Sort Z-A \n 3: Sort by Ticket price-Low to High \n 4: Sort by Ticket price-High to Low \n 5. Sort by City \n 6: Quit \n");
        boolean tryAgain = true;

        Scanner sc = new Scanner(System.in);
        while (tryAgain) {
            int num=0;
            try {
                System.out.print("Please enter an int 1-6: ");
                num = sc.nextInt();
                if ((num < 1) || (num > 6)) {
                    System.out.println("Invalid entry-PLEASE SELECT A VALID CHOICE");
                }
            }
            catch(Exception e) {
                System.out.println("Invalid entry-PLEASE SELECT A VALID CHOICE");
                sc.nextLine();

            } finally {
                sc.nextLine();
                if ((num > 0) && (num < 7)) {
                }
            }
            if (num==1){
                t.azSearch();
            }
            if (num==2){
                t.zaSearch();
            }
            if(num==3){
                t.priceLowToHigh();
            }
            if(num==4){
                t.priceHighToLow();
            }
            if (num==5)

            {
                System.out.println("Enter City:  ");
                String city= sc.nextLine();
                String print = "Date\t\t\tPrice\t\t\tQty\t\t\tPerformer\t\n";
                print += "-------------------------------------------------------------\n";
                System.out.println(print);
                t.linearSearch(city);
            }
            else if(num==6)
            {
                System.out.println("Search Ended-THANK YOU!!!!!");
                tryAgain=false;
            }
        }
    }
}