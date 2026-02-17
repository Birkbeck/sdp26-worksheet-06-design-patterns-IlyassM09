package visitor;

public class HtmlText implements HtmlContent {
    private String text;

    public HtmlText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String getHtml() {
        return getText() + "\n";
    }

    @Override
    public void accept(Visitor visitor) {
        // TODO: implement
    }
}
