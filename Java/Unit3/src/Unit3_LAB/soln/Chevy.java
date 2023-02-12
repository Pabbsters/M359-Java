package Unit3_LAB.soln;

public class Chevy {

    private int year;
    private int mileage;
    private double fuelEfficiency;
    private double basePrice;
    private double upgradePrice;
    private double grandTotal;
    private String model;
    private String color;
    private boolean luxuryStatus;
    private boolean fourWDStatus;
    private boolean sportsStatus;

    public Chevy() {
        year = 2021;
        mileage = 0;
        fuelEfficiency = 35;
        basePrice = 16000;
        upgradePrice = 16000;
        grandTotal = 16000;
        model = "Trax";
        color = "White";
        luxuryStatus = false;
        fourWDStatus = false;
        sportsStatus = false;
    }

    public Chevy(int y, int mil, double fuel, double base, String mod, String c, boolean lux, boolean four, boolean sports) {
        year = y;
        mileage = mil;
        fuelEfficiency = fuel;
        basePrice = base;
        model = mod;
        color = c;
        luxuryStatus = lux;
        fourWDStatus = four;
        sportsStatus = sports;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setFuelEfficiency(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getUpgradePrice() {
        return upgradePrice;
    }

    public void setUpgradePrice(double upgradePrice) {
        this.upgradePrice = upgradePrice;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isLuxuryStatus() {
        return luxuryStatus;
    }

    public void setLuxuryStatus(boolean luxuryStatus) {
        this.luxuryStatus = luxuryStatus;
    }

    public boolean isFourWDStatus() {
        return fourWDStatus;
    }

    public void setFourWDStatus(boolean fourWDStatus) {
        this.fourWDStatus = fourWDStatus;
    }

    public boolean isSportsStatus() {
        return sportsStatus;
    }

    public void setSportsStatus(boolean sportsStatus) {
        this.sportsStatus = sportsStatus;
    }
    public int compareTo(Chevy other) {
        return this.mileage - other.getMileage();
    }
    public boolean equals(Chevy obj) {
        if (obj.getModel() == this.model) {
            if (obj.getColor() == this.color) {
                return true;
            } else {
                return false;
            }
        }
            if (obj.getMileage() < 200) {
                return false;
            } else {
                return true;
            }
        }
        public double totalUpgrades(){
        upgradePrice = basePrice;
        if(luxuryStatus == true) {
            upgradePrice += basePrice * .2;
        }
        if(fourWDStatus == true){
            upgradePrice += 3500;
        }
        if(sportsStatus == true) {
            upgradePrice += basePrice * .15;
            fuelEfficiency *= .2;
        }
        return upgradePrice;
    }
    public double calcPrice() {
        grandTotal = basePrice;
        if (luxuryStatus == true) {
            grandTotal += basePrice * .2;
        }
        if (fourWDStatus == true) {
            grandTotal += 3500;
        }
        if (sportsStatus == true) {
            grandTotal += basePrice * .15;
            fuelEfficiency *= .2;
        }
        return grandTotal + grandTotal * .122;
    }
    public String toString(){
        String output = "";
        output += "**************************************************";
        output += "\n" + year + " " + model + " " + "(" + color + ")";
        output += "\n\tBASE PRICE:                $" + basePrice;
        output += "\n\tMILES:                     " + mileage;
        output += "\n\tFUEL EFFICIENCY:           " + fuelEfficiency + " mpg";
        output += "\n\tPACKAGES:";
        if (luxuryStatus == true) {
            output += "\n\t\t - Luxury Package";
        }
        if (fourWDStatus == true) {
            output += "\n\t\t - 4WD Package";
        }
        if (sportsStatus == true){
            output += "\n\t\t - Sports Package";
        }
        if (luxuryStatus == false && fourWDStatus == false && sportsStatus == false) {
            output += "\n\t\t - None";
        }
        output += "";
        output += "\n\tPRICE WITH UPGRADES: $" + totalUpgrades();
        output += "\n\tFINAL PRICE WITH TAX: $" +calcPrice();
        output += "**************************************************";
        return output;
        }
    }
