package factorymethod;

public class TestFactoryPattern {

    public static void main(String... args) {

        String xml = "<error> error message </error>";
        XMLParserFactory xmlParserFactory = new XMLParserFactory();
        XMLParser parser = xmlParserFactory.getParser("ERROR");
        String msg = parser.parse(xml);
        System.out.println(msg);

        System.out.println("***********************************************");

        xml = "<feedback> feedback message </feedback>";
        parser = xmlParserFactory.getParser("FEEDBACK");
        msg = parser.parse(xml);
        System.out.println(msg);

        System.out.println("***********************************************");

        xml = "<order> order request </order>";
        parser = xmlParserFactory.getParser("ORDER");
        msg = parser.parse(xml);
        System.out.println(msg);

        System.out.println("***********************************************");

    }
}