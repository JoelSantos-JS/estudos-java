package academy.devdojo.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.ietf.jgss.Oid;

import academy.devdojo.javacore.Ycolecoes.domain.Manga;

class MangaIdComparator implements Comparator<Manga> {

    @Override
    
    public int compare(Manga o1, Manga o2) {
        // TODO Auto-generated method stub
        return o1.getId().compareTo(o2.getId());
    }
}

public class MangaSortTest01 {
        public static void main(String[] args) {
            List<Manga> list = new ArrayList<>(6);

            list.add( new Manga(5L,"dbx", 19.9));
            list.add( new Manga(6L,"dbx", 18.9));
            list.add( new Manga(7L,"dbx", 17.9));

            list.sort(new MangaIdComparator());
            for (Manga manga : list) {
                    System.out.println(manga);
            }
            

        }   
}
