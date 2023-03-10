package academy.devdojo.javacore.metodos.test;

import academy.devdojo.javacore.dominio.Funcionario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.idade = 10;
        funcionario.nome = "Joel";
      double[] result=   funcionario.salario = new double[]{1000, 5000 , 2500};

        funcionario.imprimeDados();

        funcionario.mediaSalarios(result);
}
}
