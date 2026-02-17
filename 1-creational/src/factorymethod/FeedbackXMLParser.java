package factorymethod;

public class FeedbackXMLParser implements XMLParser {

    @Override
    public String parse(String xml) {
        System.out.println("Parsing feedback XML...");
        xml = xml.replaceAll("<feedback>", "").replaceAll("</feedback>", "").trim();
        return xml;
    }
}