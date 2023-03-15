package academy.devdojo.javacore.Kenumeracao.test;

import academy.devdojo.javacore.Kenumeracao.dominio.Client;
import academy.devdojo.javacore.Kenumeracao.dominio.TipoClient;
import academy.devdojo.javacore.Kenumeracao.dominio.Client.TipoPagamento;

public class ClientTest01 {
    public static void main(String[] args) {
      Client client = new Client("Joel",TipoClient.PESSOA_FISICA, TipoPagamento.CREDITO);
      Client client2 = new Client("Joel 2", TipoClient.PESSOA_JURIDICA, TipoPagamento.CREDITO);
     
      System.out.println(client);
      System.out.println(client2);
      System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
     
    }
}
