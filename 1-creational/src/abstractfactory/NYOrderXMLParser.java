package abstractfactory;

public class NYOrderXMLParser implements XMLParser {

    @Override
    public String parse(String xml) {
        System.out.println("Parsing NY order XML...");
        xml = xml.replaceAll("<order>", "").replaceAll("</order>", "").trim();
        return xml;
    }
}