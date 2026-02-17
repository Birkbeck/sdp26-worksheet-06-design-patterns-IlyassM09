package composite;

import java.util.List;

public abstract class HtmlContent {
    public abstract String getTagName();

    public void addChild(HtmlContent child) {
        throw new UnsupportedOperationException("Current operation is not support for this object");
    }

    public void removeChild(HtmlContent child) {
        throw new UnsupportedOperationException("Current operation is not support for this object");
    }

    public List<HtmlContent> getChildren() {
        throw new UnsupportedOperationException("Current operation is not support for this object");
    }

    public abstract String getHtml();
}
