package solid.ocp.abstractClass;


/**
 * This method is useful when Behaviors have common Logic but differ in some steps
 */
public abstract class ReportGenerator {
    final void generate() {
        fetchData();
        format();
        export();
    }
    abstract void fetchData();
    abstract void format();
    abstract void export();
}
