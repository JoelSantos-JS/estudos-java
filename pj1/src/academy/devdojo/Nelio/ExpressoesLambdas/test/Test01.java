package academy.devdojo.Nelio.ExpressoesLambdas.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import academy.devdojo.Nelio.ExpressoesLambdas.domain.Product;
import academy.devdojo.javacore.Jmodificadorfinal.dominio.Comparador;

public class Test01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String path = "C:/Users/joelt/Desktop/java/file.txt";

        try (BufferedReader bf = new BufferedReader( new FileReader(path))) {

            List<Product> products = new ArrayList<>();


            String line = bf.readLine();

            while(line != null) {
                String[] fildes = line.split(",");
                products.add(new Product(fildes[0],Double.parseDouble(fildes[1]) ));
                line = bf.readLine();
            }

         double list =    products.stream().map( x -> x.getPreco()).reduce(0.0 , (x, y) -> x + y / products.size());

            System.out.println(list);

            Comparator<String> comp = (s1, s2) ->  s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> list2 = products.stream().filter( p -> p.getPreco() < list).map( p -> p.getNome()).sorted(comp.reversed()).collect(Collectors.toList());

            for (String string : list2) {
                System.out.println(string);
            }
            
        } catch (Exception e) {
            // TODO: handle exception
            throw new Error("Algo nao esta correto ");
        }
        sc.close();
    }
}
