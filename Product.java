class Product implements Taxable {
    @SuppressWarnings("unused")
    private int pid;
    private double price;
    private int quantity;
    
    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
    
    @Override
    public double calcTax() {
        return price * salesTax * quantity;
    }
}