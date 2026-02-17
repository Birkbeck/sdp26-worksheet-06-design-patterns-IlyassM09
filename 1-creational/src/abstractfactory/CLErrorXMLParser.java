package abstractfactory;

public class CLErrorXMLParser implements XMLParser {

    @Override
    public String parse(String xml) {
        System.out.println("Parsing CL error XML...");
        xml = xml.replaceAll("<error>", "").replaceAll("</error>", "").trim();
        return xml;
    }
}