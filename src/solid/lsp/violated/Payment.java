package solid.lsp.violated;

public class Payment {

    protected double amount;
    public Payment(double amount) {
        this.amount = amount;
    }

    public boolean process() {
        if(amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative.");
        }
        System.out.println("Processing payment of: " + amount);
        return true;
    }

    public double getAmount() {
        return amount;
    }
}
