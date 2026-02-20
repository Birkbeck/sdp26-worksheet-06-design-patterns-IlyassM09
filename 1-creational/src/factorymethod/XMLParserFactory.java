package factorymethod;

public class XMLParserFactory {

    public XMLParser getParser(String xmlType) {
        return switch (xmlType){
            case "ERROR" -> new ErrorXMLParser();
            case "FEEDBACK" -> new FeedbackXMLParser();
            case "ORDER" -> new OrderXMLParser();
            default -> throw new IllegalArgumentException("Type of your XML is invalid!");
        };
    }
}