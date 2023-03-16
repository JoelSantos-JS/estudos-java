package academy.devdojo.javacore.Npolimorfismo.servico;

import academy.devdojo.javacore.Npolimorfismo.dominio.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    
    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados");
    }
}
