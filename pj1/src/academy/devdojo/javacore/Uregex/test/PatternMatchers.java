package academy.devdojo.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatchers {
    public static void main(String[] args) {

       // \d = Todos os digitos
       // \D = tudo o que nao for digito
       // \s = espaçoes em branco \n \t \r \f
       // \S = todos os caracters excluindo os brancos
       // \w = a-ZA-Z, digitos,
       //  \W = tudo o que nao for incluso no \w
       // []


        String regex = "aaa";
        String match = "aabbaaabbaaa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(match);
        while(matcher.find()) {
            System.out.print(matcher.start()+ " ");
        }
    }
}
