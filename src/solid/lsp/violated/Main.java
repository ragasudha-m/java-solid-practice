package solid.lsp.violated;

public class Main {
    public static void main(String[] args) {
//        Payment payment = new DiscountedPayment(1500);
//        try{
//            payment.process();
//        } catch (Exception e){
//            System.out.println("Exception caught: " + e.getMessage());
//        }
//
//        boolean result = payment.process();
//        System.out.println("Payment processed: " + result);
//
//        System.out.println("Original amount: " + payment.getAmount());
//        ((DiscountedPayment) payment).applyExtraCharge();
//        System.out.println("After change:" + payment.getAmount());
//
//        System.out.println("Repeated call1: " + payment.getAmount());
//        System.out.println("Repeated call2: " + payment.getAmount());


        Shape shape = new Rectangle();
        shape.setWidth(5);
        shape.setHeight(10);
        System.out.println("Rectangle area: " + shape.area());

        shape = new Square();
        shape.setWidth(5);
        shape.setHeight(10); // ❌ Breaks expectation (Square should not allow independent width/height)
        System.out.println("Square area: " + shape.area());

        shape = new Circle();
        shape.setWidth(5); // ❌ Throws exception (Circle doesn't support width)
        System.out.println("Circle area: " + shape.area());


    }
}
