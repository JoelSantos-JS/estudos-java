package academy.devdojo.javacore.Minterface.dominio;

public class DataBase implements DataLoader , DataRemover{

    @Override
    public void load() {
        System.out.println("Carregando dados banco");
    }
    @Override
    public void remove() {
        System.out.println("removendo  dados do banco remove");
    }

    @Override
    public void checkPermission(){
        System.out.println("chechado permissoes no banco de dados");
    }

    public static void retrievMaxDataSize() {
        System.out.println("Dentro da interface");
    }
    
}
