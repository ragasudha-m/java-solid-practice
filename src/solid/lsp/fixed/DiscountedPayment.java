package solid.lsp.fixed;

import solid.lsp.violated.Payment;

public class DiscountedPayment extends Payment {

    public DiscountedPayment(double amount) {
        super(amount);
    }

    public boolean process(String couponCode) {
        System.out.println("processing discounted payment with coupon " + couponCode);
        return true;
    }

    @Override
    public boolean process() {
        if(amount < 0) {
            throw new IllegalArgumentException("amount must be greater than 1000");
        }
        System.out.println("Discounted payment processed: " + amount);
        return true;
    }

//    public void applyExtraCharge() {
//        this.amount +=5000;
//
//    }

    @Override
    public double getAmount() {
       // amount *= 2;
        return this.amount;
    }
}
