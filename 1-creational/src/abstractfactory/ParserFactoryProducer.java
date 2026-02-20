package abstractfactory;

public final class ParserFactoryProducer {

    private ParserFactoryProducer() { }

    public static AbstractParserFactory getFactory(String factoryType) {
        return switch (factoryType){
            case "CLFactory" -> new CLParserFactory();
            case "NYFactory" -> new NYParserFactory();
            default -> throw new IllegalArgumentException("Factory type is not allowed!");
        };
    }
}