package abstractfactory;

public interface AbstractParserFactory {
    XMLParser getParser(String parserType);
}