package academy.devdojo.livro.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import academy.devdojo.livro.Usuario;

public class UsuarioTest01 {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("JOEL", 150);
        Usuario usuario2 = new Usuario("Jose", 250);
        Usuario usuario3 = new Usuario("Jose almendia", 250);


        List<Usuario> list = new ArrayList<>();
        list.add(usuario);
        list.add(usuario2);
        list.add(usuario3);

        for (Usuario usuario4 : list) {
            System.out.println(usuario4.getNome());
        }


        Consumer<Usuario> mostrador = new Consumer<Usuario>() {
          

            @Override
            public void accept(Usuario t) {
                // TODO Auto-generated method stub
               System.out.println(t.getNome());
            }
        };

        list.forEach(new Consumer<Usuario>() {

            @Override
            public void accept(Usuario t) {
                // TODO Auto-generated method stub
               System.out.println(t.getNome());
            }
            
        });
    
    }
}
