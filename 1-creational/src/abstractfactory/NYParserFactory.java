package abstractfactory;

public class NYParserFactory implements AbstractParserFactory {
    @Override
    public XMLParser getParser(String parserType) {
        return switch (parserType){
            case "ERROR" -> new NYErrorXMLParser();
            case "FEEDBACK" -> new NYFeedbackXMLParser();
            case "ORDER" -> new NYOrderXMLParser();
            default -> throw new IllegalArgumentException("Parser type is not correct in the NY parser!");
        };
    }
}
