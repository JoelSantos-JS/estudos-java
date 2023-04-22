package academy.devdojo.Nelio.MapeamentoObjeto.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

import academy.devdojo.Nelio.MapeamentoObjeto.Pessoa;

public class TestPessoa02 {
    private static long total = 0;
    public static void main(String[] args) {
        Pessoa pessoa  = new Pessoa(1,"Joel" , 25);
        Pessoa pessoa2  = new Pessoa(2,"VC Jose" , 26);
        Pessoa pessoa3 = new Pessoa(3,"Lucas Mano" , 35);
        Pessoa pessoa4  = new Pessoa(4,"Liminha SANTOS" , 15);

        List<Pessoa> pessoas = Arrays.asList(pessoa,pessoa2,pessoa3,pessoa4);




        Map<Integer,List<Pessoa>> pessoasMap = pessoas.stream().collect(Collectors.groupingBy(Pessoa::getIdade));

      


        


        long sum = LongStream.range(0, 10).parallel().filter(x -> x % 2 == 0).sum();


System.out.println(sum);
    }
}
