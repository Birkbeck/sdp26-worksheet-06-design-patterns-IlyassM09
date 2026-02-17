package abstractfactory;

public class NYErrorXMLParser implements XMLParser {

    @Override
    public String parse(String xml) {
        System.out.println("Parsing NY error XML...");
        xml = xml.replaceAll("<error>", "").replaceAll("</error>", "").trim();
        return xml;
    }
}