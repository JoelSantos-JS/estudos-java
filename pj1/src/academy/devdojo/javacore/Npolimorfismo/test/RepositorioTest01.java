package academy.devdojo.javacore.Npolimorfismo.test;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTest01 {
    public static void main(String[] args) {
        RepositorioBancoDeDados repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
        List<String> list = new ArrayList<>();
        list.add("Goku");
        list.add("Vegeta");
        list.add("Kuririn");
        System.out.println(list);
    }
}
