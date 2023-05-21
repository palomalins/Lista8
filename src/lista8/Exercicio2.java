package lista8;

import java.util.Arrays;

public class Exercicio2 {

    public static void main(String[] args) {
        int numA[] = {11, 21, 31, 41, 51, 61, 71, 81};
        int numB[] = new int[8];

        for (int i = 0; i < numA.length; i++) {
            numB[i] = numA[i] * 2;
        }
        System.out.println("Vetor original(A):" + Arrays.toString(numA));
        System.out.println("Vetor multiplicado(B):" + Arrays.toString(numB));
    }
}
