package academy.devdojo.javacore.Rdatatest.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormtTest01 {
    public static void main(String[] args) {
        Locale locale = new Locale("pt", "br");
        Locale locale2 = new Locale("en", "en");

        Locale locale3 = Locale.JAPAN;
        NumberFormat[] nfa = new NumberFormat[3];

        nfa[0] = NumberFormat.getInstance();
        nfa[1]= NumberFormat.getInstance(locale);
        nfa[2] = NumberFormat.getInstance(locale2);
        nfa[3] = NumberFormat.getInstance(locale3);
    }
}
