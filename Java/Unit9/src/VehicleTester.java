/**
 * Daniel
 * Ruthwik
 * Desteph
 * P2
 * Purpose: Tester class to get output using polymorphism
 */
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class VehicleTester {
    /**
     * initializes several objects of different types of vehicles (ex. car, plane, and ship) by upcasting
     * and prompts the user to input a number between 1 and 4 to execute different commands.
     * The class also handles exceptions if the user inputs a non-integer or an integer outside the range of 1-4 using try-catch.
     * @param args
     * @throws InputMismatchException
     */
    public static void main(String[] args) throws InputMismatchException {
        Vehicle jaredCar = new Car("Jared", 2023, "Subaru", "Outback", 40524.99, "Black", 2500, true, "SUV");
        Vehicle philCar = new Car("Phil", 2002, "Porsche", "911", 24999.99, "Gray", 3800, false, "Sports Car");
        Vehicle jesusPlane = new Plane("Jesus", 2007, "Axis Jet", "Citation X", 2999999.99, 25000, 10000, 80, 3);
        Vehicle michaelPlane = new Plane("Michael", 1939, "Piston Military Aircraft", "Bucker Jungmann BU-131", 834999.99, 121000, 1500, 2, 2);
        Vehicle pabloShip = new Ship("Pablo", 2008, "Huanghai Shipbuilding", "DWT 7991", 6249999.99, 15);
        Vehicle kyleShip = new Ship("Kyle", 2014, "Hyundai Mipo Dockyard", "Blue Trader", 1499999.99,  8);
        Scanner input = new Scanner(System.in);
        boolean quit = false;
        int userInput = -1;
        System.out.println("Hello user! Enter a number from 1 to 4\n1 = Output the arraylist for the car owners\n2 = Output the arraylist for the plane owners\n3 = Output the arraylist for the ship owners\n4 = Quit");
        while(!quit){
            try{
                userInput = input.nextInt();
                input.nextLine();
            }
            catch(InputMismatchException e){
                System.out.println("Again, please enter a number from 1 to 4\n1 = Output the arraylist for the car owners\n2 = Output the arraylist for the plane owners\n3 = Output the arraylist for the ship owners\n4 = Quit");
                input.nextLine();
                // include continue so when the wrong input is a letter, it won't display the message twice
                continue;
            }
            if(userInput < 1 || userInput > 4){
                System.out.println("Again, please enter a number from 1 to 4\n1 = Output the arraylist for the car owners\n2 = Output the arraylist for the plane owners\n3 = Output the arraylist for the ship owners\n4 = Quit");
            }
//            if(userInput == 1){
//               If the user input is equal to 1, the program creates an ArrayList called carOwners that holds objects of the Vehicle class.
//               Two Car objects are then created and added to this ArrayList using the add method.
//               After adding the Car objects to the ArrayList, the program enters a for loop that iterates over each Vehicle object in the ArrayList.
//               For each Vehicle, the "changePrice" method is called, followed by the toString.
//            }
//            if(userInput == 2){
//               If the user input is equal to 2, the program creates an ArrayList called planeOwners that holds objects of the Vehicle class.
////             Two plane objects are then created and added to this ArrayList using the add method.
////             After adding the Plane objects to the ArrayList, the program enters a for loop that iterates over each Vehicle object in the ArrayList.
////             For each Vehicle, the "changePrice" method is called, followed by the toString.
//            }
//            if(userInput == 3){
//               If the user input is equal to 3, the program creates an ArrayList called shipOwners that holds objects of the Vehicle class.
////             Two Ship objects are then created and added to this ArrayList using the add method.
////             After adding the Ship objects to the ArrayList, the program enters a for loop that iterates over each Vehicle object in the ArrayList.
////             For each Vehicle, the "changePrice" method is called, followed by the toString.
//            }
            if(userInput == 1){
                ArrayList<Vehicle> carOwners = new ArrayList<Vehicle>();
                carOwners.add(new Car("Jared", 2023, "Subaru", "Outback", 40524.99, "Black", 2500, true, "SUV"));
                carOwners.add(new Car("Phil", 2002, "Porsche", "911", 24999.99, "Gray", 3800, false, "Sports Car"));
                for (Vehicle c: carOwners){
                    c.changePrice();
                    System.out.println(c);
                }
                System.out.println();
                System.out.println("Please enter a number from 1 to 4\n1 = Output the arraylist for the car owners\n2 = Output the arraylist for the plane owners\n3 = Output the arraylist for the ship owners\n4 = Quit");
            }
            if(userInput == 2){
                ArrayList<Vehicle> planeOwners = new ArrayList<Vehicle>();
                planeOwners.add(new Plane("Jesus", 2007, "Axis Jet", "Citation X", 2999999.99, 25000, 10000, 80, 3));
                planeOwners.add(new Plane("Michael", 1939, "Piston Military Aircraft", "Bucker Jungmann BU-131", 834999.99, 121000, 1500, 2, 2));
                for (Vehicle p: planeOwners){
                    p.changePrice();
                    System.out.println(p);
                }
                System.out.println();
                System.out.println("Please enter a number from 1 to 4\n1 = Output the arraylist for the car owners\n2 = Output the arraylist for the plane owners\n3 = Output the arraylist for the ship owners\n4 = Quit");
            }
            if(userInput == 3){
                ArrayList<Vehicle> shipOwners = new ArrayList<Vehicle>();
                shipOwners.add(new Ship("Pablo", 2008, "Huanghai Shipbuilding", "DWT 7991", 6249999.99, 15));
                shipOwners.add(new Ship("Kyle", 2014, "Hyundai Mipo Dockyard", "Blue Trader", 1499999.99,  8));
                for (Vehicle s: shipOwners){
                    s.changePrice();
                    System.out.println(s);
                }
                System.out.println();
                System.out.println("Please enter a number from 1 to 4\n1 = Output the arraylist for the car owners\n2 = Output the arraylist for the plane owners\n3 = Output the arraylist for the ship owners\n4 = Quit");
            }
            if(userInput == 4){
                System.out.println("Thanks for testing out the vehicle tester class!");
                quit = true;
            }
        }
    }
}