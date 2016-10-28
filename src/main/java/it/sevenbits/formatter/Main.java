/**
 * Package containing Formatter method
 */
package it.sevenbits.formatter;

public class Main {

    public static void main(final String[] args) {
        String s = "int i=34;int c=7;if(i>2){int k=++;}";
        Formatter.checkSymbol(s);

    }
}
