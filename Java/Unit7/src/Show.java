import java.util.Scanner;

public class Show {
    private String date;
    private double price;
    private int qty;
    private String performer;
    private String city;
    public Show(String date, double price, int qty, String performer, String city){
        this.date= date;
        this.price= price;
        this.qty= qty;
        this.performer= performer;
        this.city= city;
    }

    public String getDate(){
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public String getPerformer(){
        return performer;
    }
    public void setPerformer(String performer) {
        this.performer = performer;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    /**
     *
     * @return
     */
    public String toString(){
        String print="";
        print+= date+ "\t$"+ price+ "\t\t" + qty + "\t\t" + performer + "\t\t\t" + city + "\n";
        print += "\n";
        return print;

    }
}