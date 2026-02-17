package factorymethod;

public class OrderXMLParser implements XMLParser {

    @Override
    public String parse(String xml) {
        System.out.println("Parsing order XML...");
        xml = xml.replaceAll("<order>", "").replaceAll("</order>", "").trim();
        return xml;
    }
}