package factorymethod;

public class ErrorXMLParser implements XMLParser {

    @Override
    public String parse(String xml) {
        System.out.println("Parsing error XML...");
        xml = xml.replaceAll("<error>", "").replaceAll("</error>", "").trim();
        return xml;
    }
}