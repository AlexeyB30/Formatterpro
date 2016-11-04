package it.sevenbits.formatter;

/**
 * StrWriter for Formatter
 */

public class StrWriter implements IWriter {

    private StringBuilder builder = new StringBuilder();

    public String toString() {

        return builder.toString();
    }

    public void writeChar(char c) {
        builder.append(c);
        System.out.print(c);
    }
}