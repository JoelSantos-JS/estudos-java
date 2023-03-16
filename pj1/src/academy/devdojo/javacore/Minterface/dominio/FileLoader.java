package academy.devdojo.javacore.Minterface.dominio;

public class FileLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Dados");
    }

    @Override
    public void remove() {
        System.out.println("removendo  dados do banco remove 5");
    }
    @Override

    public void checkPermission(){
        System.out.println("chechado permissoes no  arquivos");
    }
    
}

