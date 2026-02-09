package solid.lsp.fixed;

import solid.lsp.violated.DiscountedPayment;
import solid.lsp.violated.Payment;

public class Main {
    public static void main(String[] args) {
        Payment payment = new solid.lsp.violated.DiscountedPayment(1500);
        try{
            payment.process();
        } catch (Exception e){
            System.out.println("Exception caught: " + e.getMessage());
        }

        boolean result = payment.process();
        System.out.println("Payment processed: " + result);

        System.out.println("Original amount: " + payment.getAmount());
        ((DiscountedPayment) payment).applyExtraCharge();
        System.out.println("After change:" + payment.getAmount());

        System.out.println("Repeated call1: " + payment.getAmount());
        System.out.println("Repeated call2: " + payment.getAmount());

    }
}
