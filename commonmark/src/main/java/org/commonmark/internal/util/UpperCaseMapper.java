package org.commonmark.internal.util;

import java.util.Locale;

public class UpperCaseMapper implements CharMapper {
    final public static UpperCaseMapper INSTANCE = new UpperCaseMapper();

    Locale locale = null;

    public UpperCaseMapper() {
    }

    public UpperCaseMapper(Locale locale) {
        this.locale = locale;
    }

    @Override
    public char map(char c, CharSequence charSequence, int index) {
        return c == '\0' ? '\uFFFD' : Character.toUpperCase(c);
    }
}
