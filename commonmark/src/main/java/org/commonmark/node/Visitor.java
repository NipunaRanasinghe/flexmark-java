package org.commonmark.node;

/**
 * Node visitor.
 * <p>
 * See {@link AbstractVisitor} for a base class that can be extended.
 */
public interface Visitor {

    void visit(BlockQuote blockQuote);

    void visit(BulletList bulletList);

    void visit(Code code);

    void visit(Document document);

    void visit(Emphasis emphasis);

    void visit(FencedCodeBlock fencedCodeBlock);

    void visit(HardLineBreak hardLineBreak);

    void visit(Heading heading);

    void visit(Reference reference);

    void visit(ThematicBreak thematicBreak);

    void visit(HtmlInline htmlInline);

    void visit(MailLink mailLink);

    void visit(HtmlEntity htmlEntity);

    void visit(AutoLink autoLink);

    void visit(HtmlBlock htmlBlock);

    void visit(Image image);

    void visit(ImageRef image);

    void visit(IndentedCodeBlock indentedCodeBlock);

    void visit(Link link);

    void visit(LinkRef link);

    void visit(ListItem listItem);

    void visit(OrderedList orderedList);

    void visit(Paragraph paragraph);

    void visit(SoftLineBreak softLineBreak);

    void visit(StrongEmphasis strongEmphasis);

    void visit(Text text);

    void visit(CustomBlock customBlock);

    void visit(CustomNode customNode);
}
