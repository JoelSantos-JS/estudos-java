package academy.devdojo.livro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import academy.devdojo.livro.Usuario;

public class UsuarioTest03 {
    public static void main(String ... args) {
        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);
        List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
        
        Function<Usuario, Integer> getIdade = Usuario::getPonto;


        

        usuarios.sort(Comparator.comparingInt(Usuario::getPonto).reversed());
        usuarios.forEach(System.out::println);
        }
}
