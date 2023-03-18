package academy.devdojo.javacore.Oexception.exception.test;

public class ExpetionTest03 {
    public static void main(String[] args) {
     abreConexao();
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados nos aquivos");
           return "Abrindo conexecao";
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }finally{
            System.out.println("Fechando recurso liberado pelo SO");
            
        }

        return null;
    }

    
}
