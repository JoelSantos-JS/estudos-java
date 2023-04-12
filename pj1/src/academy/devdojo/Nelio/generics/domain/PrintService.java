package academy.devdojo.Nelio.generics.domain;

import java.util.ArrayList;
import java.util.List;

public class  PrintService<T> {
    private Integer value;
    private List<T> vIntegers = new ArrayList<>(3);


    

    public void addValue(T valor) {
        vIntegers.add(valor);
    }

   
    public void print() {
        if(vIntegers.isEmpty()) {
            throw new Error("Lista esta vazia");
        }
       System.out.println("Size" + vIntegers);
    }

    public T pfirts() {
        if(vIntegers.isEmpty()) {
            throw new Error("Lista esta vazia");
        }
       return vIntegers.get(0); 
    }


    public Integer getValue() {
        return value;
    }



    public List<T> getvIntegers() {
        return vIntegers;
    }


    
}
