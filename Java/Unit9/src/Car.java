public class Car extends Vehicle {
    private String color;
    private boolean isElectric;
    private String bodyStyles;


    public Car(String ownerName, int year, String company, String model, double price, int mileage, String color,
               boolean isElectric, String bodyStyles) {
        super(ownerName, year, company, model, price, mileage);
        this.color = color;
        this.isElectric = isElectric;
        this.bodyStyles = bodyStyles;
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
    public String toString() {
        if (isElectric)
            return super.toString() + "This " + color + "electric car is a " + bodyStyles;
        else {
            return super.toString() + "This " + color + "gas car is a " + bodyStyles;
        }
    }
}