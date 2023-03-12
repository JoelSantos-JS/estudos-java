package academy.devdojo.javacore.Gassociacao.test;

import javax.security.auth.kerberos.KerberosKey;

import academy.devdojo.javacore.Gassociacao.domain.Jogador;

public class JogadorTest {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Joel");
        Jogador jogador1 = new Jogador("Joel 1");
        Jogador jogador23 = new Jogador("Joel 2" );
        Jogador[] jogadores = {jogador,jogador1,jogador23};


        for (Jogador jogador2 : jogadores) {
            jogador2.imprime();
        }
    }
}
