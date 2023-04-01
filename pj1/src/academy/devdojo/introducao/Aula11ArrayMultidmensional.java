package academy.devdojo.introducao;

public class Aula11ArrayMultidmensional {''
    public static void main(String[] args) {
        int[][] dias = new int[3][3];
        dias[0][0] = 31;
   
        dias[0][2] = 15;
        dias[1][0] = 2;
        dias[1][1] = 1;
        dias[0][1] = 28;



        for(int i=0; i < dias.length; i++) {
            for(int j=0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("-------------------");

        for (int[] is : dias) {
            for (int ios : is) {
                System.out.println(ios);
            }
        }
    }
}
