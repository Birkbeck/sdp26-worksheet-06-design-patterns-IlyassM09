package proxy.protection;

public class Owner implements Staff {
    private ReportGeneratorProxy reportGenerator;

    @Override
    public void setReportGenerator(ReportGeneratorProxy reportGenerator) {
        this.reportGenerator = reportGenerator;
    }

    @Override
    public boolean isOwner() {
        return true;
    }

    public String generateDailyReport() {
        try {
            return reportGenerator.generateDailyReport();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}