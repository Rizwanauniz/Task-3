class Employee implements Taxable{
    @SuppressWarnings("unused")
    private int empId;
    @SuppressWarnings("unused")
    private String name;
    double salary;

    public Employee (int empId, String name, double salary){
        this.empId = empId;
        this.salary = salary;
    }
    
    @Override 
    public double calcTax(){
        return salary * incomeTax;
    }
}
