package academy.devdojo.javacore.Uregex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texStrint = "Levi, Eren";
        String[] nomes = texStrint.split(",");

        for (String string : nomes) {
            System.out.println(string.trim());
        }
    }
}
