package academy.devdojo.javacore.test;

import academy.devdojo.javacore.dominio.Pessoa;
import academy.devdojo.javacore.metodos.test.Impressora;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa estudante = new Pessoa();
        estudante.idade = 10;
        estudante.nome= "Joel";
        estudante.sexo = 'M';

        Impressora imprrime = new Impressora();
        
        imprrime.impressora(estudante);
    }
}
