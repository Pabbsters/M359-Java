public class Transmission extends Car{
    private String transmissionType;
    private boolean isAutomatic;
    public Transmission(int year, String company, String model, double basePrice, int mileage, String transmissionType, boolean isAutomatic) {
        super(year, company, model, basePrice, mileage);
        this.transmissionType = transmissionType;
        this.isAutomatic = isAutomatic;
    }
    public boolean checkTransmissionType(){
        if(transmissionType == "Automatic"){
            isAutomatic = true;
        }
        else{
            isAutomatic = false;
        }
        return isAutomatic;
    }
    public double updatePrice(){
        double updatedPrice;
        if(isAutomatic) {
            // 1500 - 3000
             updatedPrice = (Math.random() * 3000.0) + 1500.0;
        }
        else{
            updatedPrice = super.getPrice();
        }
        return super.setPrice(updatedPrice);
    }
    public String toString(){
        return super.toString();
    }
}