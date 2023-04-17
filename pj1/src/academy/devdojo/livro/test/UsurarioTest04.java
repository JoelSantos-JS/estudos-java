package academy.devdojo.livro.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;

import academy.devdojo.livro.Usuario;

public class UsurarioTest04 {
    public static void main(String[] args) {
        Function<String ,Usuario> criarUsuarario = Usuario::new;

        Usuario joel = criarUsuarario.apply("Joel Jose");
        Usuario Marcos = criarUsuarario.apply("Marcos Santos");

        List<Usuario> list = new ArrayList<>();

        for (Usuario usuario : list) {
                System.out.println(usuario);
        }

    }
}
