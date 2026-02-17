package visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HtmlNormalElement extends HtmlElement {
    private final List<HtmlContent> children = new ArrayList<>();

    public HtmlNormalElement(String tagName) {
        super(tagName);
    }

    public void addChild(HtmlContent child) {
        children.add(child);
    }

    public void removeChild(HtmlContent child) {
        children.remove(child);
    }

    public List<HtmlContent> getChildren() {
        return children;
    }

    @Override
    public String getHtml() {
        String attributes = getAttributesHtml();
        return "<" + getTagName() + (attributes.isEmpty() ? "" : " " + attributes) +  ">\n" +
                children.stream()
                        .map(HtmlContent::getHtml)
                        .collect(Collectors.joining(""))
                + "</" + getTagName() + ">\n";
    }

    @Override
    public void accept(Visitor visitor) {
        // TODO: implement
    }
}