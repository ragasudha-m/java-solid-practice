package solid.isp.fixed;


public class AdvancedPrinter implements AdvancedPrinterInterface {
    @Override
    public void print(String content) {
        System.out.println("Printing: " + content);
    }

    @Override
    public void scan(String document) {
        System.out.println("Scanning: " + document);
    }

}
