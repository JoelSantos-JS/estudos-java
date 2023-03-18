package academy.devdojo.javacore.QString.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "JOEL s";
        nome.concat(" Jose");

        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Joel jose ");
        sb.append("Dev");
        System.out.println(sb);
    }
}
