package composite;

public class TestCompositePattern {
    public static void main(String[] args) {
        HtmlContent parentTag = new HtmlNormalElement("<html>");

        HtmlContent p1 = new HtmlNormalElement("<body>");
        parentTag.addChild(p1);

        HtmlContent child1 = new HtmlNormalElement("<p>");
        p1.addChild(child1);

        HtmlContent text1 = new HtmlText("Testing html tag library");
        child1.addChild(text1);

        HtmlContent br = new HtmlVoidElement("<br>");
        child1.addChild(br);

        HtmlContent text2 = new HtmlText("Start a new line");
        child1.addChild(text2);

        HtmlContent child2 = new HtmlNormalElement("<p>");
        p1.addChild(child2);

        HtmlContent text3 = new HtmlText("Paragraph 2");
        child2.addChild(text3);

        System.out.println(parentTag.getHtml());
    }
}