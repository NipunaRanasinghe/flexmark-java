package org.commonmark.internal.util;

public class NullCharacterMapper implements CharMapper {
    final public static NullCharacterMapper INSTANCE = new NullCharacterMapper();

    @Override
    public char map(char c, CharSequence charSequence, int index) {
        return c == '\0' ? '\uFFFD' : c;
    }

}
