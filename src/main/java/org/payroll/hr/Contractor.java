package org.payroll.hr;

public class Contractor implements Payable{

    private int hoursWorked;
    private double partsCost;
    private String name;

    public void setPartsCost(double partsCost) {
        this.partsCost = partsCost;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public Contractor(String name, int hoursWorked, double partsCost) {
        this.hoursWorked = hoursWorked;
        this.name = name;
        this.partsCost = partsCost;
    }

    @Override
    public double calculatePay() {
        return this.partsCost * this.hoursWorked;
    }

    @Override
    public String generatePayStub(String payDate) {
        return "\t\t\t" + "\n\t" + "Name: " + this.name +
                "\n\t" + "Pay Date \t " + payDate +
                "\n\t" + "Hours \t" + this.hoursWorked +
                "\n\t" + "Payment $" + this.calculatePay() + "\n\n";
    }

    @Override
    public String toString() {
        return"Name: " + this.name +"\nHours Worked: " + this.hoursWorked + "\nParts : " + this.partsCost;
    }
}
