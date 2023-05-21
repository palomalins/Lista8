package lista8;

import static java.lang.Math.sqrt;
import java.util.Arrays;

public class Exercicio4 {
    public static void main(String[] args) {
        int numA[] = {1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121, 144, 169, 196, 225};
        int numB[] = new int[15];

        for (int i = 0; i < numA.length; i++) {
            numB[i] = (int) sqrt(numA[i]);
        }
        System.out.println("Vetor original(A):" + Arrays.toString(numA));
        System.out.println("Raiz quadrada do Vetor(B):" + Arrays.toString(numB));
    }
}
