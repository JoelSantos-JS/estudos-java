package academy.devdojo.livro.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import academy.devdojo.livro.Usuario;

public class UsuarioTest02 {
    public static void main(String ... args) {
        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);
        List<Usuario> usuarios  = new ArrayList<>();
        usuarios.add(user1);
        usuarios.add(user2);
        usuarios.add(user3);
    

        
        Function<Usuario , Integer> function = u -> u.getPonto();

        Comparator<Usuario> comparator = Comparator.comparingInt(Usuario::getPonto).thenComparing(Usuario::getNome);


        usuarios.sort(comparator.reversed());


        for (Usuario usuario : usuarios) {
        System.out.println(usuario);            
        }


    
        
        }
}
