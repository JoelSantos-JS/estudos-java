package academy.devdojo.javacore.Gassociacao.test;

import academy.devdojo.javacore.Gassociacao.domain.Jogador;
import academy.devdojo.javacore.Gassociacao.domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Joel");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador};
        jogador.setTime(time);
        time.setJogadores(jogadores);
        System.out.println("----------Jogadores");
        jogador.imprime();
        System.out.println("Time");
        time.imprime();
    }
}
