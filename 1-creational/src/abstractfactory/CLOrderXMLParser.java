package abstractfactory;

public class CLOrderXMLParser implements XMLParser {

    @Override
    public String parse(String xml) {
        System.out.println("Parsing CL order XML...");
        xml = xml.replaceAll("<order>", "").replaceAll("</order>", "").trim();
        return xml;
    }
}