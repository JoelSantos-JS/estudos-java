package academy.devdojo.Nelio.generics.domain;

import java.util.ArrayList;
import java.util.List;

public class PrintService {
    private Integer value;
    private List<Integer> vIntegers = new ArrayList<>(3);


    

    public void addValue(Integer valor) {
        vIntegers.add(valor);
    }

   

    public void pfirts() {
       System.out.println("Primeiro numero do array " +vIntegers.get(0)); 
    }


    public Integer getValue() {
        return value;
    }



    public List<Integer> getvIntegers() {
        return vIntegers;
    }


    
}
