package abstractfactory;

public class CLParserFactory implements AbstractParserFactory {
    @Override
    public XMLParser getParser(String parserType) {
        return switch (parserType){
            case "ERROR" -> new CLErrorXMLParser();
            case "FEEDBACK" -> new CLFeedbackXMLParser();
            case "ORDER" -> new CLOrderXMLParser();
            default -> throw new IllegalArgumentException("Parser type is not valid");
        };
    }
}
