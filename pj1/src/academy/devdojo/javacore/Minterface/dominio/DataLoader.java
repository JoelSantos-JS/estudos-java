package academy.devdojo.javacore.Minterface.dominio;

public interface DataLoader {
    void load();
    default void checkPermission() {
        System.out.println("Fazendo checagem de permissoes");
    }
    public static void retrievMaxDataSize() {
        System.out.println("Dentro da interface");
    }
}
