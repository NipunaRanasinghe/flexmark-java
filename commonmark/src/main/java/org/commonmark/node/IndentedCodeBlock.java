package org.commonmark.node;

import org.commonmark.internal.BlockContent;
import org.commonmark.internal.util.BasedSequence;

import java.util.List;

public class IndentedCodeBlock extends Block {

    public IndentedCodeBlock() {
    }

    public IndentedCodeBlock(BasedSequence chars) {
        super(chars);
    }

    public IndentedCodeBlock(BasedSequence chars, List<BasedSequence> segments) {
        super(chars, segments);
    }

    public IndentedCodeBlock(BlockContent blockContent) {
        super(blockContent);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
