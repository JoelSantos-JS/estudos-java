package academy.devdojo.javacore.Gassociacao.test;

import academy.devdojo.javacore.Gassociacao.domain.Escola;
import academy.devdojo.javacore.Gassociacao.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Joel");
        Professor[] professores = {professor};
        Escola escola = new Escola("Firmo", professores);

        escola.imprime();
    }
}
