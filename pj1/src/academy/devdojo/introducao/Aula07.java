package academy.devdojo.introducao;

public class Aula07 {
    public static void main(String[] args) {
        byte name = 5;

        switch(name){
            case 1: System.out.println("Domingo");
            break;
            case 2: System.out.println("Segunda");
            break;
            case 3: System.out.println("Terca");
            break;
            case 4: System.out.println("Quarta");
            break;
            case 5: System.out.println("Quinta");
            break;
            case 6: System.out.println("Sexta");
            break;
        }

        char sexo = 'M';

        switch(sexo ){
            case 'M': System.out.println("É homen");
            break;
            case 'F' : System.out.println("É mulher");
        }
        
    }
}
