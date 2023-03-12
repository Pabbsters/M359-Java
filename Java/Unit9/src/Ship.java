public class Ship extends Vehicle{
    private int draftSize;
    private int maxWeight;
    private int maxPeople;
    private int numEngines;

    public Ship(String ownerName, int year, String company, String model, double price, int mileage, int maxWeight,
                int maxPeople, int numEngines, int draftSize){
        super(ownerName, year, company, model, price, mileage);
        this.maxWeight= maxWeight;
        this.maxPeople= maxPeople;
        this.numEngines= numEngines;
        this.draftSize= draftSize;
    }

    public int getDraftSize() {
        return draftSize;
    }

    public void setDraftSize(int draftSize) {
        this.draftSize = draftSize;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getNumEngines() {
        return numEngines;
    }

    public void setNumEngines(int numEngines) {
        this.numEngines = numEngines;
    }

    public String toString() {
        return super.toString() + "This ship can go " + draftSize + "meters under the water!";
    }
}
