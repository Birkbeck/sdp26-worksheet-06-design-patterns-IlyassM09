package proxy.protection;

public class ReportGeneratorProtectionProxy implements ReportGeneratorProxy {
    private final Staff staff;

    public ReportGeneratorProtectionProxy(Staff staff) {
        this.staff = staff;
    }

    @Override
    public String generateDailyReport() {
        // TODO: implement
        return null;
    }
}