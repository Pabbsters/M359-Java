import java.util.Scanner;

public class Payroll {
    private String empName;
    private int hours;
    private double hourlyRate;
    private double federalTax;
    private double stateTax;
    private double grossPay;
    private double fedDeduction;
    private double stateDeduction;
    private double netPay;

    public Payroll(String n, int h, double r, double f, double s) {
        empName= n;
        hours= h;
        hourlyRate= r;
        federalTax= f;
        stateTax= s;
    }
    public double grossPay(){
        grossPay= hours * hourlyRate;
        return grossPay;
    }
    public double getFederalTax(){
        fedDeduction= grossPay * (federalTax/100);
        return fedDeduction;
    }
    public double getStateTax(){
        stateDeduction= grossPay * (stateTax/100);
        return stateDeduction;
    }
    public double getNetPay(){
        netPay= grossPay-(fedDeduction + stateDeduction);
        return netPay;
    }


    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter employee's name:");
        String name= input.nextLine();
        System.out.println("Enter number of hours worked in a week:");
        int hours= input.nextInt();
        System.out.println("Enter hourly pay rate:");
        double rate= input.nextDouble();
        System.out.println("Enter federal tax withholding rate:");
        double fedTax= input.nextDouble();
        System.out.println("Enter state tax withholding rate:");
        double stateTax= input.nextDouble();
        Payroll pay= new Payroll(name, hours, rate, fedTax, stateTax);
        double grossPay= pay.grossPay();
        double fedCalc= pay.getFederalTax();
        double stateCalc= pay.getStateTax();
        double netPay= pay.getNetPay();
        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Pay Rate:  $" + rate);
        System.out.println("Gross Pay:  $" + grossPay);
        System.out.println("Deductions:");
        System.out.println("\t");
        System.out.println("\tFederal Withholding (20.0%): $" +fedCalc);
        System.out.println("\tState Withholding (9.0%): $" +stateCalc);
        System.out.println("\tTotal Deductions:  $" + (fedCalc + stateCalc));
        System.out.println("Net Pay:  $" + netPay);
    }




    }
