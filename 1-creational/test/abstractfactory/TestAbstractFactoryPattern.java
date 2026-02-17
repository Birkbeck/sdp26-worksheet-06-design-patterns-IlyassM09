package abstractfactory;

public class TestAbstractFactoryPattern {
    public static void main(String... args) {

        String xml = "<error> error message </error>";
        AbstractParserFactory parserFactory = ParserFactoryProducer.getFactory("CLFactory");
        XMLParser parser = parserFactory.getParser("ERROR");
        String msg = parser.parse(xml);
        System.out.println(msg);

        System.out.println("***********************************************");

        parserFactory = ParserFactoryProducer.getFactory("NYFactory");
        xml = "<feedback> feedback message </feedback>";
        parser = parserFactory.getParser("FEEDBACK");
        msg = parser.parse(xml);
        System.out.println(msg);

        System.out.println("***********************************************");

        parserFactory = ParserFactoryProducer.getFactory("NYFactory");
        xml = "<order> order request </order>";
        parser = parserFactory.getParser("ORDER");
        msg = parser.parse(xml);
        System.out.println(msg);
    }
}
