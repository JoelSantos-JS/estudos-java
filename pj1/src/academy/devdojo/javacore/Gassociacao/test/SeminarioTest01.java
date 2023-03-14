package academy.devdojo.javacore.Gassociacao.test;

import academy.devdojo.javacore.Gassociacao.exercicios.Professor;
import academy.devdojo.javacore.Gassociacao.exercicios.Aluno;
import academy.devdojo.javacore.Gassociacao.exercicios.Local;
import academy.devdojo.javacore.Gassociacao.exercicios.Seminario;

public class SeminarioTest01 {
    public static void main(String[] args) {
    Local local = new Local("centro");
    Aluno aluno = new Aluno("Joel", 20);
    Professor professor = new Professor("Luciano", "TI");
    Aluno[] alunos = {aluno};
    Seminario seminario = new Seminario("Tudo Sobre ti" , alunos, local );
    Seminario[] seminarios = {seminario};
    professor.setSeminarios(seminarios);

    professor.imprime();

   
    }
}
