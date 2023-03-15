package academy.devdojo.javacore.Kenumeracao.dominio;

public enum TipoClient {
    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);

    public  final int valor;
     TipoClient(int valor) {
        this.valor = valor;
     }
}
