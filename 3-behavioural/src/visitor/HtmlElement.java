package visitor;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public abstract class HtmlElement implements HtmlContent {
    private final Map<String, String> attributes = new HashMap<>();
    private String tagName;

    public HtmlElement(String tagName) {
        this.tagName = tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getTagName() {
        return tagName;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    protected String getAttributesHtml() {
        return attributes.entrySet().stream()
                .map(e -> e.getKey() + "=\"" + e.getValue() + "\"")
                .collect(Collectors.joining(", "));
    }
}
