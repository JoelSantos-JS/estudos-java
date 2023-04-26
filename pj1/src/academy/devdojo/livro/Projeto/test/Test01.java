package academy.devdojo.livro.Projeto.test;

import java.math.BigDecimal;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import academy.devdojo.livro.Projeto.domain.Customer;
import academy.devdojo.livro.Projeto.domain.Payment;
import academy.devdojo.livro.Projeto.domain.Product;

public class Test01 {
    public static void main(String[] args) {
        Customer joel = new Customer("Joel");
        Customer jose = new Customer("Jose");
        Customer  maria = new Customer("Maria");
        Customer josefa = new Customer("Josefa");

      Product p1 = new Product("Camiseta", Paths.get("C:/Users/joelt/Desktop/java/music/1.mp4")  ,new BigDecimal(50));
      Product p2 = new Product("Camiseta preta", Paths.get("C:/Users/joelt/Desktop/java/music/2.mp4")  ,new BigDecimal(150));
      Product p3 = new Product("Camiseta blue", Paths.get("C:/Users/joelt/Desktop/java/music/3.mp4")  ,new BigDecimal(350));


      LocalDateTime localDateTime = LocalDateTime.now();
      LocalDateTime localDateTime2 = LocalDateTime.now().minusDays(1);
      LocalDateTime localDateTime3 = LocalDateTime.now().plusDays(1);


      Payment payment = new Payment(Arrays.asList(p1,p2) , localDateTime3, josefa);
      Payment payment2 = new Payment(Arrays.asList(p3,p2) , localDateTime, joel);

      List<Payment> payments = Arrays.asList(payment,payment2);


      payments.stream().sorted(Comparator.comparing(Payment::getDate)).forEach(System.out::println);

      payment.getProducts().stream().map(e -> e.getPrice()).reduce(BigDecimal::add).ifPresent(System.out::println);
    }
}
