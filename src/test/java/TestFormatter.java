/**
 * TestFormatter for Formatter
 */

import it.sevenbits.formatter.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestFormatter {
    private IFormatter formatter;

    @Before
        public void setUp() {
         formatter = new Formatter();
        }


        @Test
        public void testCopy(){
            String s="int i=34;int c=7;if(i>2){int k=++;if((k=1)&&(k!=2)){switch (c){int 5;int r;}}}";
            IReader input = new StrReader(s);
            IWriter output = new StrWriter();
            formatter.format(input, output);
            assertEquals("int i=34;\n" +
                    "int c=7;\n" +
                    "if(i>2){\n" +
                    "\tint k=++;\n" +
                    "\tif((k=1)&&(k!=2)){\n" +
                    "\t\tswitch (c){\n" +
                    "\t\t\tint 5;\n" +
                    "\t\t\tint r;\n" +
                    "\t\t}\n" +
                    "\t}\n" +
                    "}\n", output.toString());
        }
}
