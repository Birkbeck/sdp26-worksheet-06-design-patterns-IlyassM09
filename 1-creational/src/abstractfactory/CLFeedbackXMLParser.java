package abstractfactory;

public class CLFeedbackXMLParser implements XMLParser {

    @Override
    public String parse(String xml) {
        System.out.println("Parsing CL feedback XML...");
        xml = xml.replaceAll("<feedback>", "").replaceAll("</feedback>", "").trim();
        return xml;
    }
}