/**
 * Daniel
 * Ruthwik
 * Desteph
 * P2
 * Purpose: specialized air vehicle, building from parent
 */
public class Plane extends Vehicle{
    private int maxWeight;
    private int maxPeople;
    private int numEngines;
    private int numHoursFlew;
    public Plane(String ownerName, int year, String company, String model, double price, int numHoursFlew, int maxWeight,
                 int maxPeople, int numEngines) {
        super(ownerName, year, company, model, price);
        this.maxWeight= maxWeight;
        this.maxPeople= maxPeople;
        this.numEngines= numEngines;
        this.numHoursFlew= numHoursFlew;
    }
    public int getMaxWeight() {
        return maxWeight;
    }
    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
    public int getMaxPeople() {
        return maxPeople;
    }
    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }
    public int getNumEngines() {
        return numEngines;
    }
    public void setNumEngines(int numEngines) {
        this.numEngines = numEngines;
    }
    @Override
    /**
     * used super.changePrice() so that for instance, if the plane's year is greater than 2000 and the hours is less than 100000,
     * the price will increase 2500.00 + 15000.00
     * @return planePrice
     */
    public double changePrice(){
        double planePrice = 0.0;
        if(numHoursFlew < 100000){
            planePrice = super.changePrice() + 15000.00;
        }
        else{
            planePrice = super.changePrice() - 15000.00;
        }
        return planePrice;
    }
    @Override
    /**
     * uses super.toString() to return a sentence stating the owner's name, plane's year, model, company, etc.
     * @returns sentence with numEngines + maxPeople + maxWeight
     */
    public String toString(){
        return super.toString() + "\nThis plane model has " + numEngines + " engines, can carry up to " + maxPeople +
                " people, and has the capacity to hold up to " + maxWeight + " pounds";
    }
}