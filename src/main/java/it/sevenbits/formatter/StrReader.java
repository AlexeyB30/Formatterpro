package it.sevenbits.formatter;

/**
 * StrReader for Formatter
 */

public class StrReader implements IReader {

    private String enter;
    private int index = 0;

    public StrReader(String st) {

        this.enter = st;
    }

    public boolean hasChar() {

        return index < enter.length();
    }

    public char readChar() {
        return enter.charAt(index++);
    }
}