package academy.devdojo.javacore.modificadorStatico.test;

import academy.devdojo.javacore.modificadorStatico.domain.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro("Mercedes" , 280);
        Carro carro1 = new Carro("ferrari" , 270);
        Carro carro2 = new Carro("redbull" , 290);
        
        Carro.velocidadeLimete = 200;
        carro.imprime();
       
        carro1.imprime();
        carro2.imprime();

    }
}
