package academy.devdojo.introducao;

public class Aula10 {
    public static void main(String[] args) {
        int[] numeros = new int[3];

        int[] numeros2 = {1,23,4,5};


       for(int i =0; i < numeros2.length; i++  ){
        System.out.println(numeros2[i]);
       }

       for (int i : numeros2) {
        System.out.println(i);
       }
    }
}
