package academy.devdojo.javacore.Heranca.test;

import academy.devdojo.javacore.Heranca.dominio.Endereço;
import academy.devdojo.javacore.Heranca.dominio.Funcionarios;
import academy.devdojo.javacore.Heranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereço endereço = new Endereço(null, null);
        endereço.setRua("Rua 1");
        endereço.setCep("45200-727");
        Pessoa pessoa = new Pessoa("Jelo");
        pessoa.setCpf("0111912685");
        pessoa.setNome("Joel");
        pessoa.setEndereço(endereço);

        pessoa.imprime();

        Funcionarios funcionarios = new Funcionarios("Joel");
        funcionarios.setNome("Jeol");
        funcionarios.setCpf("5564544");
        funcionarios.setEndereço(endereço);
        funcionarios.setSalario(5000);
        funcionarios.imprime();
        funcionarios.relatorioDePagamento();
    }
}
