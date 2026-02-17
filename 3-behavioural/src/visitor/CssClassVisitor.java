package visitor;

public class CssClassVisitor implements Visitor {

    @Override
    public void visit(HtmlVoidElement element) {
        element.getAttributes().put("class", "visitor");
    }

    @Override
    public void visit(HtmlNormalElement element) {
        element.getAttributes().put("class", "visitor");
        for (HtmlContent child : element.getChildren())
            child.accept(this);
    }

    @Override
    public void visit(HtmlText text) {
    }
}