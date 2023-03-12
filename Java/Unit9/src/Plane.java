public class Plane extends Vehicle{
    private int maxWeight;
    private int maxPeople;
    private int numEngines;

    public Plane(String ownerName, int year, String company, String model, double price, int mileage, int maxWeight,
                 int maxPeople, int numEngines) {
        super(ownerName, year, company, model, price, mileage);
        this.maxWeight= maxWeight;
        this.maxPeople= maxPeople;
        this.numEngines= numEngines;
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

    public String toString(){
        return super.toString() + "This " + numEngines + " plane has the capacity to carry " + maxPeople +
                "and the capacity to hold " + maxWeight + "weight";
    }
}