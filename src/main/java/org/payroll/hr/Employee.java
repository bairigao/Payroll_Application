package org.payroll.hr;

public abstract class Employee implements Payable{

    private String name;
    private Double payRate;
    private final int EMPLOYEE_ID;
    private Address address;
    private static int nextID = 1000;
    protected static final double STARTING_PAY_RATE = 7.75;

    public Employee(String name) {
        this.name = name;
        payRate = STARTING_PAY_RATE;
        EMPLOYEE_ID = getNextID();
    }

    public Employee(String name, Double payRate) {
        this.name = name;
        this.payRate = payRate;
        EMPLOYEE_ID = getEmployeeID();
    }

    public String getName() { return this.name; }

    public int getEmployeeID() { return this.EMPLOYEE_ID; }

    public double getPayRate() { return this.payRate; }

    public void displayAddress() {
        System.out.println(address.toString());
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setName(String name) { this.name = name; }

    public void setPayRate(double payRate) { this.payRate = payRate; }

    public static int getNextID() {
        int id = nextID;
        nextID++;
        return id;
    }

    @Override
    public String toString(){
        return "Employee ID - " + this.EMPLOYEE_ID + "\nName - " +this.name
                + "\n" + this.address.toString();
    }
}
