package lista8;

import java.util.Arrays;

public class Exercicio3 {

    public static void main(String[] args) {
        int numA[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int numB[] = new int[15];

        for (int i = 0; i < numA.length; i++) {
            numB[i] = numA[i] * numA[i];
        }
        System.out.println("Vetor original(A):" + Arrays.toString(numA));
        System.out.println("Vetor ao quadrado(B):" + Arrays.toString(numB));
    }
}
