package academy.devdojo.introducao;

public class Aula11ArrayMultidmensial2 {
    public static void main(String[] args) {
        int[][] arryInt = new int[3][];

        arryInt[0] = new int[2];
        arryInt[1] = new int[3];
        arryInt[2] = new int[6];
        
        
        arryInt[0][0] = 1;
        arryInt[0][1] = 2;
       
        arryInt[1][0] = 3;
        arryInt[1][1] = 4;
        arryInt[1][2] = 5;

        arryInt[2][0] = 15;
        arryInt[2][1] = 16;
        arryInt[2][2] = 17;
        arryInt[2][3] = 18;
        arryInt[2][4] = 19;
        arryInt[2][5] = 20;

        for (int[] is : arryInt) {
            for (int is2 : is) {
                System.out.println(is2);
            }
        }

    }
}
