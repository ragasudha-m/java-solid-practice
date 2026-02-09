package solid.isp.violated;


public class AdvancedPrinter implements MultiFunctionDevice {
    @Override
    public void print(String content) {
        System.out.println("Printing: " + content);
    }

    @Override
    public void scan(String document) {
        System.out.println("Scanning: " + document);
    }

    @Override
    public void fax(String document) {
        throw new UnsupportedOperationException("Fax not supported");
    }

    @Override
    public void staple(String document) {
        throw new UnsupportedOperationException("Staple not supported");
    }

    @Override
    public void photocopy(String document) {
        throw new UnsupportedOperationException("Photocopy not supported");
    }
}
