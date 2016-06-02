package org.commonmark.node;

import org.commonmark.internal.BlockContent;
import org.commonmark.internal.util.BasedSequence;

import java.util.List;

/**
 * HTML block
 *
 * @see <a href="http://spec.commonmark.org/0.18/#html-blocks">CommonMark Spec</a>
 */
public class HtmlBlock extends Block {
    public HtmlBlock() {
    }

    public HtmlBlock(BasedSequence chars) {
        super(chars);
    }

    public HtmlBlock(BasedSequence chars, List<BasedSequence> segments) {
        super(chars, segments);
    }

    public HtmlBlock(BlockContent blockContent) {
        super(blockContent);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
