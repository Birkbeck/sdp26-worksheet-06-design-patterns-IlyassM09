package visitor;

public class HtmlVoidElement extends HtmlElement {

    public HtmlVoidElement(String tagName) {
        super(tagName);
    }

   @Override
    public String getHtml() {
        return "<" + getTagName() + " " + getAttributesHtml() + "/>\n";
    }

    @Override
    public void accept(Visitor visitor) {
        // TODO: implement
    }
}