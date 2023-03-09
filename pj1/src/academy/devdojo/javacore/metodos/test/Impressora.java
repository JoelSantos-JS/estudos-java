package academy.devdojo.javacore.metodos.test;

import academy.devdojo.javacore.dominio.Pessoa;


public class Impressora{
    public  void impressora(Pessoa pessoa) {


        System.out.println(pessoa.idade);
        System.out.println(pessoa.nome);
        System.out.println(pessoa.sexo);
        
    }
}