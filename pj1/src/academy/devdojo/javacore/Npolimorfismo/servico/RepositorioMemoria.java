package academy.devdojo.javacore.Npolimorfismo.servico;

import academy.devdojo.javacore.Npolimorfismo.dominio.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    
    @Override

    public void salvar() {
        System.out.println("Salvando em memoria");
    }
}
