package org.commonmark.node;

import org.commonmark.internal.util.BasedSequence;

public class Emphasis extends DelimitedNode {
    public Emphasis() {
    }

    public Emphasis(BasedSequence chars) {
        super(chars);
    }

    public Emphasis(BasedSequence openingMarker, BasedSequence content, BasedSequence closingMarker) {
        super(openingMarker, content, closingMarker);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
