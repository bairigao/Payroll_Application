package org.payroll.hr;

public class HourlyEmployee extends Employee{

    private int hoursWorked;

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public HourlyEmployee(String name, int hoursWorked) {
        super(name);
        this.hoursWorked = hoursWorked;
    }

    public HourlyEmployee(String name) {
        super(name);
    }

    @Override
    public double calculatePay() {
        return this.hoursWorked * getPayRate();
    }

    @Override
    public String generatePayStub(String payDate) {
        return "\t\t\t" + "\n\t" + "Name: " + this.getName() +
                "\n\t" + "Pay Date \t " + payDate +
                "\n\t" + "Hours \t" + this.hoursWorked +
                "\n\t" + "Payment $" + this.calculatePay() + "\n\n";
    }

    @Override
    public String toString() {
        return "\t\t\t" + "\n\t" + "Name: " + this.getName() +
                "\n\t" + "Hours \t " + this.hoursWorked +
                "\n\t" + "Total Days Payment $" + this.calculatePay();
    }
}
