/**
 * Daniel
 * Ruthwik
 * Desteph
 * P2
 * Purpose: specialized land vehicle, building from parent
 */
public class Car extends Vehicle {
    private String color;
    private boolean isElectric;
    private String bodyStyles;
    private int mileage;
    public Car(String ownerName, int year, String company, String model, double price, String color, int mileage,
               boolean isElectric, String bodyStyles) {
        super(ownerName, year, company, model, price);
        this.color = color;
        this.isElectric = isElectric;
        this.bodyStyles = bodyStyles;
        this.mileage= mileage;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean getElectric() {
        return isElectric;
    }
    public void setElectric(boolean electric) {
        isElectric = electric;
    }
    public String getBodyStyles() {
        return bodyStyles;
    }
    public void setBodyStyles(String bodyStyles) {
        this.bodyStyles = bodyStyles;
    }
    @Override
    /**
     * the first overriding of the method
     * implemented super.changePrice() so that for instance, if the car's year is less than 2000 and the mileage is greater than 3000
     * it will decrease 2500.00 and also decrease 4500.00
     * @return carPrice
     */
    public double changePrice(){
        double carPrice = 0.0;
        if(mileage < 3000){
            carPrice = super.changePrice() + 4500.00;
        }
        else{
            carPrice = super.changePrice() - 4500.00;
        }
        return carPrice;
    }
    @Override
    /**
     * if the boolean is true, then the output will say electric car
     * otherwise it will say gas car
     * @returns sentence with color and bodyStyles
     */
    public String toString() {
        if (isElectric)
            return super.toString() + "\nThis " + color + " electric car is a " + bodyStyles;
        else {
            return super.toString() + "\nThis " + color + " gas car is a " + bodyStyles;
        }
    }
}