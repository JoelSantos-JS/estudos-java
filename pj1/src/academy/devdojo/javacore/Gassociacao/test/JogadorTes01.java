package academy.devdojo.javacore.Gassociacao.test;

import academy.devdojo.javacore.Gassociacao.domain.Jogador;
import academy.devdojo.javacore.Gassociacao.domain.Time;

public class JogadorTes01 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Jo");
        
        Time time = new Time("Joel ");

        jogador.setTime(time);
        jogador.imprime();
    
    
    }
}
