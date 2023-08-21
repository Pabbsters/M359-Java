/**
 * Daniel
 * Ruthwik
 * Desteph
 * P2
 * Purpose: baseline for all vehicles
 */
public class Vehicle {
    private String ownerName;
    private int year;
    private String company;
    private String model;
    private double price;
    public Vehicle(String ownerName, int year, String company, String model, double price){
        this.ownerName= ownerName;
        this.year = year;
        this.company = company;
        this.model = model;
        this.price = price;
    }

    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public double getPrice(){
        return price;
    }
    public double setPrice(double price){
        return this.price = price;
    }

    /**
     * the method that will be overridden three times
     * the base price set in the tester class will either increase or decrease based on the conditions of the method statements
     * @return price
     */
    public double changePrice(){
        if(year < 2000){
            price -= 2500.00;
        }
        else if(year > 2000){
            price += 2500.00;
        }
        return price;

    }

    /**
     * @returns a sentence consisting of the instance variables ownerName, year, company, and model
     * the method changePrice() is used instead of the price variable because the output of the method will be overrided
     * based on the conditions of the owners made in the tester class
     */
    public String toString(){
        return ownerName + "'s " + year + " " + company + " " + model + " costs $" + changePrice() ;
    }
}