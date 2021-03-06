package com.vladsch.flexmark.ext.typographic.internal;

import com.vladsch.flexmark.ext.typographic.TypographicSmarts;
import com.vladsch.flexmark.parser.InlineParser;
import com.vladsch.flexmark.parser.InlineParserExtension;
import com.vladsch.flexmark.parser.InlineParserExtensionFactory;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.sequence.BasedSequence;

import java.util.Set;

public class SmartsInlineParser implements InlineParserExtension {
    private final SmartsParsing parsing;

    public SmartsInlineParser(final InlineParser inlineParser) {
        this.parsing = new SmartsParsing(inlineParser.getParsing());
    }

    @Override
    public void finalizeDocument(final InlineParser inlineParser) {

    }

    @Override
    public void finalizeBlock(final InlineParser inlineParser) {
        
    }

    @Override
    public boolean parse(final InlineParser inlineParser) {
        BasedSequence match = inlineParser.match(parsing.SMARTS);
        if (match != null) {
            BasedSequence input = inlineParser.getInput();
            inlineParser.flushTextNode();

            String typographicSmarts;

            if (match.matches(parsing.ELIPSIS)) typographicSmarts = "&hellip;";
            else if (match.matches(parsing.ELIPSIS_SPACED)) typographicSmarts = "&hellip;";
            else if (match.matches(parsing.EN_DASH)) typographicSmarts = "&ndash;";
            else if (match.matches(parsing.EM_DASH)) typographicSmarts = "&mdash;";
            else return false;

            TypographicSmarts smarts = new TypographicSmarts(match, typographicSmarts);
            inlineParser.getBlock().appendChild(smarts);
            return true;
        }
        return false;
    }

    public static class Factory implements InlineParserExtensionFactory {
        @Override
        public Set<Class<? extends InlineParserExtensionFactory>> getAfterDependents() {
            return null;
        }

        @Override
        public CharSequence getCharacters() {
            return ".-";
        }

        @Override
        public Set<Class<? extends InlineParserExtensionFactory>> getBeforeDependents() {
            return null;
        }

        @Override
        public InlineParserExtension create(final InlineParser inlineParser) {
            return new SmartsInlineParser(inlineParser);
        }

        @Override
        public boolean affectsGlobalScope() {
            return false;
        }
    }
}
