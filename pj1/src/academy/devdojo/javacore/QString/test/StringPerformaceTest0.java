package academy.devdojo.javacore.QString.test;



public class StringPerformaceTest0 {
public static void main(String[] args) {
    long inicio = System.currentTimeMillis();
    concatString(100_000);
    long fim = System.currentTimeMillis();

    System.out.println("Tempo gasto para String" + (fim - inicio) + "ms");
}

private static void concatString(int tamanho) {
    String text = "";

    for(int i =0; i < tamanho; i++) {
        text += i;
    }

}

}
