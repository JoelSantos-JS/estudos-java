package academy.devdojo.introducao;

import java.sql.Date;
import java.util.Calendar;

public class Aula03 {
    public static void main(String[] args) {
        String nome = "Joel";
        String endereco = "Rua delsom machaodo";
        double salario = 2500.00;
        Calendar data = Calendar.getInstance();

        System.out.println("Eu " +nome+", morando no endereco "+ endereco+ " confirmo que recebio o salario de "+salario+" , na data "+data.getTime() );
    }
}
