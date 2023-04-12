package academy.devdojo.Nelio.generics.test;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.Nelio.generics.domain.Circle;
import academy.devdojo.Nelio.generics.domain.Retangulo;
import academy.devdojo.Nelio.generics.domain.Shap;

public class ListCoringa {
    public static void main(String[] args) {
        List<Shap> mShaps = new ArrayList<>();
        mShaps.add(new Retangulo(3.0, 2.0));
        mShaps.add(new Circle(2.0));

        System.out.println("Total" + totalArea(mShaps));
    }

    public static double totalArea(List<? extends Shap> list){
        double som = 0.0;

        for (Shap shap : list) {
            som += shap.area();
        }

        return som;
    }
}
