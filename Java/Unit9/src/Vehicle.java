public class Vehicle {
    private String ownerName;
    private int year;
    private String company;
    private String model;
    private double price;
    private int mileage;
    private String vehicle;
    private String transmissionType;
    private boolean isAutomatic;


    public Vehicle(String ownerName, int year, String company, String model, double price, int mileage){
        this.ownerName= ownerName;
        this.year = year;
        this.company = company;
        this.model = model;
        this.price = price;
        this.mileage = mileage;
    }

    public Vehicle(){

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

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }
    public boolean checkTransmissionType(){
        if(transmissionType.equals("Automatic")){
            isAutomatic = true;
        }
        else{
            isAutomatic = false;
        }
        return isAutomatic;
    }
    public double updatePrice(){
        if(isAutomatic) {
            // 1500 - 3000
            price = (Math.random() * 3000.0) + 1500.0;
        }
        else{
            price = getPrice();
        }
        return setPrice(price);
    }
    public String toString(){
        return ownerName + "'s " + year + " " + company + " " + model + " costs " + price + " and has " + mileage + " miles on it";
    }


    }