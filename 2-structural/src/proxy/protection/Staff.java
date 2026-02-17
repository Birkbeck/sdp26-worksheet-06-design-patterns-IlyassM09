package proxy.protection;

public interface Staff {
    boolean isOwner();

    void setReportGenerator(ReportGeneratorProxy reportGenerator);
}
