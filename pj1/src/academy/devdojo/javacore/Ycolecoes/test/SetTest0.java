package academy.devdojo.javacore.Ycolecoes.test;

import java.util.HashSet;
import java.util.Set;

import academy.devdojo.javacore.Ycolecoes.domain.Manga;

public class SetTest0 {
    
   public static void main(String[] args) {
    
    Set<Manga> list = new HashSet<>();

    
    list.add( new Manga(5L,"dbx", 19.9, 5));
    list.add( new Manga(6L,"dbx", 18.9, 6));
    list.add( new Manga(7L,"dbx", 17.9, 9));

    for (Manga manga : list) {
        System.out.println(manga);
    }

   }

}
