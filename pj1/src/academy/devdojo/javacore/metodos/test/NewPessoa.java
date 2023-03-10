package academy.devdojo.javacore.metodos.test;

import academy.devdojo.javacore.dominio.Pessoa;

public class NewPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Pessoa pessoa2 = new Pessoa();



        pessoa.idade = 10;
        pessoa.nome = "Joel";
        pessoa.sexo = 'm';

        pessoa2.sexo = 'm';
        pessoa2.nome = "Lucas";
        pessoa2.idade = 10;
        pessoa.imprime();
        pessoa2.imprime();
    }
}
