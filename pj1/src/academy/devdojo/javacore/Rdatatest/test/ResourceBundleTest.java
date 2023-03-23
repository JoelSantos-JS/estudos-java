package academy.devdojo.javacore.Rdatatest.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
       ResourceBundle bundle = ResourceBundle.getBundle("message", new Locale("en" , "us"));
       

       System.out.println(bundle.getString("hello"));
    }
}
