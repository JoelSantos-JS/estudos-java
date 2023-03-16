package academy.devdojo.javacore.Npolimorfismo.dominio;

public class Tomate extends Produto {
        public static final double IMPOSTO_POR_CENTO = 0.06;
        private String  dataDevalidade;

    public Tomate(String nome , double valor) {
        super(nome, valor);
    }
    public Tomate(String nome , double valor, String dataDeValidade) {
        super(nome, valor);
        this.dataDevalidade = dataDeValidade;
    }


    @Override

    public double calcularImposto() {
        System.out.println("Calculando imposto do tomate");
        return this.valor * IMPOSTO_POR_CENTO;
    }

    public String getDataDevalidade() {
        return dataDevalidade;
    }
    public void setDataDevalidade(String dataDevalidade) {
        this.dataDevalidade = dataDevalidade;
    }

}
