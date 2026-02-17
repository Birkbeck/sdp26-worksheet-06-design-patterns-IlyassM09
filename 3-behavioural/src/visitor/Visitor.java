package visitor;

public interface Visitor {
    void visit(HtmlVoidElement element);

    void visit(HtmlNormalElement element);

    void visit(HtmlText text);
}