/*
 * Package containing Formatter method
 */
package it.sevenbits.formatter;

public class Formatter implements IFormatter {


    public void format(IReader input, IWriter output){
        while (input.hasChar()) {
            checkSymbol(output, input.readChar());
        }

    }
    private int block = 0;
    private boolean tag = false;

     private void checkSymbol(final IWriter output,final char symbol) {


         switch (symbol) {
                    case '{':
                        block++;
                        output.writeChar(symbol);
                        output.writeChar('\n');
                        tab(output);
                        break;

                    case ';':
                        tag = true;
                        output.writeChar(symbol);
                        output.writeChar('\n');
                        break;

                    case '}':
                        block--;
                        tab(output);
                        output.writeChar(symbol);
                        output.writeChar('\n');
                        break;

                    default:
                        if (tag) {
                            tab(output);
                            output.writeChar(symbol);
                            tag = false;
                        } else {
                            output.writeChar(symbol);
                        }
                        break;
                }

     }
    /**
     * method tab
     */
    private void tab(final IWriter output) {
        for (int i = 0; i < block; i++) {
            output.writeChar('\t');
        }
    }
}

