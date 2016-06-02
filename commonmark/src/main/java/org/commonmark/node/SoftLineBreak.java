package org.commonmark.node;

import org.commonmark.internal.util.BasedSequence;

public class SoftLineBreak extends Node {
    public SoftLineBreak() {
    }

    public SoftLineBreak(BasedSequence chars) {
        super(chars);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
