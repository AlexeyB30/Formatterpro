/*
 * Package containing Formatter method
 */
package it.sevenbits.formatter;

public class Main {

    public static void main(final String[] args) {
        String s = "int i=34;int c=7;if(i>2){int k=++;if((k=1)&&(k!=2)){switch (c){int 5;int r;}}}";
        Formatter.checkSymbol(s);
    }
}
