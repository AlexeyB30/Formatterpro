package it.sevenbits.formatter;


class Formatter {
     static void checkSymbol(String s){

        int k = 0;
        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if ((c != '{') && (c != ';') && (c != '}')) {
                System.out.print(c);
            } else {
                switch (c) {
                    case '{': {
                        System.out.println(c);
                        k = k + 1;
                        for (int j = 0; j < k; j++) {
                            System.out.print(" ");

                        }
                        break;
                    }
                    case ';': {
                        System.out.println(c);
                        for (int j = 0; j < k; j++) {
                            System.out.print(" ");
                        }
                        break;
                    }
                    case '}': {
                        k = k - 1;

                        System.out.println(c);
                        for (int j = 0; j < k; j++) {
                            System.out.print(" ");

                        }
                        break;
                    }
                    default:
                        break;
                }
            }
        }
    }
}
