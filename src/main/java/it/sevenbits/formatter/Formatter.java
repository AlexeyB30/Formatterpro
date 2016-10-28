/**
 * Package containing Formatter method
 */
package it.sevenbits.formatter;

class Formatter {
     static void checkSymbol(String s) {

        int block = 0;
        boolean tag = false;
        for (int i = 0; i < s.length(); i++) {

            char symbol = s.charAt(i);

                 switch (symbol) {
                    case '{':
                        block++;
                        System.out.println(symbol);
                        tab(block);
                        break;

                    case ';':
                        tag = true;
                        System.out.println(symbol);
                        break;

                    case '}':
                        block--;
                        tab(block);
                        System.out.println(symbol);
                        break;

                    default:
                        if (tag) {
                            tab(block);
                            System.out.print(symbol);
                            tag = false;
                        } else {
                            System.out.print(symbol);
                        }
                        break;
                }
        }
     }
    /**
     * method tab
     */
    static void tab(final int block) {
        for (int i = 0; i < block; i++) {
            System.out.print("\t");
        }
    }
}

