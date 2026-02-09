package solid.isp.fixed;




public class BasicPrinter implements BasicPrinterInterface {
    @Override
    public void print(String content) {
        System.out.println("Printing: " + content);
    }
}
