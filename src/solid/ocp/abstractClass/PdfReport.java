package solid.ocp.abstractClass;

/**
 * Implementing PDF report generation here. Similarly I can create a ExcelReport by creating another class extending ReportGenerator without modifying existing code.
 * Making it is adhering to OCP.
 */
public class PdfReport extends ReportGenerator {

    @Override
    void fetchData() {
        System.out.println("Fetching data for PDF Report");
    }

    @Override
    void format() {
        System.out.println("Formatting data for PDF Report");
    }

    @Override
    void export() {
        System.out.println("Exporting PDF Report");
    }
}
