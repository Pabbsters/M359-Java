import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TicketMaster {
    private ArrayList<Show> shows = new ArrayList<Show>();
    File myFile = new File("showData.txt");

    public TicketMaster(ArrayList<Show> shows) {
        this.shows = shows;
    }

    public int readFile() throws FileNotFoundException {
        File myFile = new File("showData.txt");
        Scanner scan = new Scanner(myFile);
        if (scan.hasNext()) {
            String date = scan.next();
            double price = Double.parseDouble(scan.next());

        }
    }
}
