import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TicketMaster {
    String city = "";
    public ArrayList<Show> shows = new ArrayList<Show>();

    public TicketMaster() {
        this.shows = shows;
    }

    /**
     *
     * @throws FileNotFoundException
     */
    public void readFile() throws FileNotFoundException {
        String p = "";
        File myFile = new File("D:\\M359-Java\\Java\\Unit7\\showData.txt");
        Scanner scan = new Scanner(myFile);
        while (scan.hasNextLine()) {
            String date = scan.next();
            double price = scan.nextDouble();
            int qty = scan.nextInt();
            String temp = scan.nextLine();
            int div = temp.indexOf(",");
            String performer = temp.substring(0, div);
            city = temp.substring(div + 2);
            Show s = new Show(date, price, qty, performer, city);
            shows.add(s);
        }
    }

    /**
     *
     * @param key
     */
    public void linearSearch(String key) {
        boolean citySearch = false;
        for (Show s : shows) {
            city = s.getCity();
            if (city.equalsIgnoreCase(key)) {
                citySearch = true;
                System.out.println(s.getDate() + "\t\t" + s.getPrice() + "\t\t\t" + s.getQty() + "\t\t\t" + s.getPerformer());
            }

        }
        if (citySearch == false) {
            System.out.println("SORRY, NO SHOWS \n");
            System.out.println(" Choose Menu Choices 1-6");
            System.out.println(" 1: Sort A-Z \n 2: Sort Z-A \n 3: Sort by Ticket price-Low to High \n 4: Sort by Ticket price-High to Low \n 5. Sort by City \n 6: Quit \n");
        }

    }

    /**
     *
     */
    public void azSearch() {
        for (int i = 0; i < shows.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < shows.size(); j++) {
                if ((shows.get(j).getPerformer()).compareTo(shows.get(minIndex).getPerformer()) < 0) {
                    minIndex = j;

                }
            }
            swapAZ(minIndex,i);
        }
        for(int k=0;k<shows.size();k++){
            System.out.println(shows.get(k));
        }

    }

    /**
     *
     * @param minIndex
     * @param i
     */
    public void swapAZ(int minIndex, int i){
        Show temp=shows.get(minIndex);
        shows.set(minIndex, shows.get(i));
        shows.set(i, temp);
    }

    /**
     *
     */
    public void zaSearch() {
        for (int i = 0; i < shows.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < shows.size(); j++) {
                if ((shows.get(j).getPerformer()).compareTo(shows.get(minIndex).getPerformer()) > 0) {
                    minIndex = j;
                }
            }
            swapZA(minIndex, i);

        }

        for(int k=0;k<shows.size();k++){
            System.out.println(shows.get(k));
        }
    }

    /**
     *
     * @param minIndex
     * @param i
     */
    public void swapZA(int minIndex, int i){
        Show temp=shows.get(minIndex);
        shows.set(minIndex, shows.get(i));
        shows.set(i, temp);
    }

    /**
     *
     */
    public void priceLowToHigh() {
        for (int j = 1; j < shows.size(); j++) {
            Show key= shows.get(j);
            int i = j;
            while ((i > 0) && ((shows.get(i-1).getPrice())> key.getPrice())) {
                shows.set(i, shows.get(i-1));
                i--;
            }
            shows.set(i,key);
        }
        for(int k=0;k<shows.size();k++) {
            System.out.println(shows.get(k));
        }
    }

    /**
     *
     */
    public void priceHighToLow() {
        for (int j = 1; j < shows.size(); j++) {
            Show key= shows.get(j);
            int i = j;
            while ((i > 0) && ((shows.get(i-1).getPrice())< key.getPrice())) {
                shows.set(i, shows.get(i-1));
                i--;
            }
            shows.set(i,key);
        }
        for(int k=0;k<shows.size();k++) {
            System.out.println(shows.get(k));
        }
    }

    /**
     *
     * @return
     */
    public String toString () {
        String print = "";
        print = "Date\t\t\tPrice\t\tQty\t\tPerformer\t\tCity\t\n";
        print += "___________________________________________________________________\n";
        for (Show s : shows) {
            print += s.getDate() + "\t\t" + s.getPrice() + "\t\t" + s.getQty() + "\t\t" + s.getPerformer() + "\t\t" + s.getCity() + "\n";

        }
        return print;
    }
}