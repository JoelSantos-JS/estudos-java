package academy.devdojo.Nelio.generics.domain;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class LerArquivos {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();


        String path = "file.txt";


        try(BufferedReader bf = new BufferedReader(new  FileReader(path))) {

            String line = bf.readLine();
            while(line != null) {
                String[] fields = line.split(",");
                products.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = bf.readLine();
            } 

            CalMax<Integer> calMax = new CalMax<>();
            var integer = calMax.max();
            System.out.println("MAX:");
            System.out.print(integer);
            
        } catch (Exception e) {
            throw new Error("Nao é possivel ler os dados");
        }
    }
}
