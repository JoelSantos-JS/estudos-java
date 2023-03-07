package academy.devdojo.javacore.test;

import academy.devdojo.javacore.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa estudante = new Pessoa();
        estudante.idade = 10;
        estudante.nome= "Joel";
        estudante.sexo = 'M';

        System.out.println(estudante.idade);
        System.out.println(estudante);
    }
}
