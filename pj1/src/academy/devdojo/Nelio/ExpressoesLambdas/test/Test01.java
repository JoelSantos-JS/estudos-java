package academy.devdojo.Nelio.ExpressoesLambdas.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import academy.devdojo.Nelio.ExpressoesLambdas.domain.Product;

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

         var list =    products.stream().map( x -> x.getPreco()).reduce(0.0 , (x, y) -> x + y / products.size());

            System.out.println(list);
            
        } catch (Exception e) {
            // TODO: handle exception
            throw new Error("Algo nao esta correto ");
        }
        sc.close();
    }
}
