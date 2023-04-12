package academy.devdojo.Nelio.generics.domain;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class LerArquivos {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();


        String path = "C:/Users/joelt/Desktop/java/file.txt";


        try(BufferedReader bf = new BufferedReader(new  FileReader(path))) {

            String line = bf.readLine();
            while(line != null) {
                String[] fields = line.split(",");
                System.out.println("FILDES" + fields[0]);
                products.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = bf.readLine();
            } 

            Product calMax =  CalMax.max(products);
          
            System.out.println("MAX:");
            System.out.print(calMax);
            
        } catch (Exception e) {
            throw new Error("Nao é possivel ler os dados");
        }
    }
}
