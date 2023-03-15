package academy.devdojo.javacore.Kenumeracao.dominio;

public class Client {
    public enum TipoPagamento{
        DEBITO {
            @Override
            public double calcularDesconto(double valor) {
                return valor * 0.1;
            }
        },CREDITO {
            @Override
            public double calcularDesconto(double valor) {
                return valor * 0.05;
            }
        };

        public double calcularDesconto(double valor) {
            return 0;
        }

        
    }
    private String nome;
    private TipoPagamento tipoPagamento;
    private TipoClient tipoClient;
    
  
    
    public Client(String nome,TipoClient tipoClient, TipoPagamento tipoPagamento) {
       
        this.nome = nome;
        this.tipoClient = tipoClient;
        this.tipoPagamento = tipoPagamento;
        
    }

    @Override

    public String toString() {
        return "Client {  " + nome + "tipo" + tipoClient; 
    }



    public String getNome() {
        return nome;
    }
 public TipoClient getTipoClient() {
     return tipoClient;
 }
  public void setTipoClient(TipoClient tipoClient) {
      this.tipoClient = tipoClient;
  }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
