package academy.devdojo.livro.Date;

import java.time.LocalDate;

public class Test01 {
public static void main(String[] args) {
    
    LocalDate localDate = LocalDate.now().plusYears(10);

    System.out.println(localDate);
}
}
