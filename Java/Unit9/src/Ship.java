/**
 * Daniel
 * Ruthwik
 * Desteph
 * P2
 * Purpose: specialized water vehicle, building from parent
 */
public class Ship extends Vehicle{
    private int draftSize;
    public Ship(String ownerName, int year, String company, String model, double price, int draftSize){
        super(ownerName, year, company, model, price);
        this.draftSize= draftSize;
    }
    public int getDraftSize() {
        return draftSize;
    }
    public void setDraftSize(int draftSize) {
        this.draftSize = draftSize;
    }
    @Override
    /**
     * used super.changePrice() so that for instance, if the ship's year is greater than 2000 but the mileage is greater than 2000000,
     * the price will increase 2500.00 but then decrease 350000.00
     * @return shipPrice
     */
    public double changePrice(){
        double shipPrice = 0.0;
        if(draftSize > 10){
            shipPrice = super.changePrice() + 350000.00;
        }
        else{
            shipPrice = super.changePrice() - 350000.00;
        }
        return shipPrice;
    }
    @Override
    /**
     * uses super.toString() to return a sentence stating the owner's name, ship's year, model, company, etc.
     * @returns sentence with draftSize
     */
    public String toString() {
        return super.toString() + "\nThis ship can go " + draftSize + " feet under the water";
    }
}