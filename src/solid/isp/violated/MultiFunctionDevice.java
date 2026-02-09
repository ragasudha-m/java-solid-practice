package solid.isp.violated;


public interface MultiFunctionDevice {
    void print(String content);
    void scan(String document);
    void fax(String document);
    void staple(String document);
    void photocopy(String document);
}
