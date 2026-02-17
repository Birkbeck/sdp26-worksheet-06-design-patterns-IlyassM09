package visitor;

public class TestVisitorPattern {
    public static void main(String[] args) {

        System.out.println("Before visitor......... \n");

        HtmlNormalElement rootElement = new HtmlNormalElement("html");
        HtmlNormalElement p1 = new HtmlNormalElement("body");
        rootElement.addChild(p1);

        HtmlNormalElement child1 = new HtmlNormalElement("p");
        p1.addChild(child1);

        HtmlText text1 = new HtmlText("Testing html tag library");
        child1.addChild(text1);

        HtmlNormalElement child2 = new HtmlNormalElement("p");
        p1.addChild(child2);

        HtmlText text2 = new HtmlText("Paragraph 2");
        child2.addChild(text2);

        System.out.println(rootElement.getHtml());

        System.out.println("After visitor....... \n");

        rootElement.accept(new CssClassVisitor());
        rootElement.accept(new StyleVisitor());
        System.out.println(rootElement.getHtml());
    }
}