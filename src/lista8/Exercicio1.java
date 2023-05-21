package lista8;

import java.util.Arrays;

public class Exercicio1 {

    public static void main(String[] args) {
        int numA[] = {29, 39, 49, 59, 69};
        int numB[] = Arrays.copyOf(numA, 5);
        System.out.println("Vetor original(A):" + Arrays.toString(numA));
        System.out.println("Vetor cópia(B):" + Arrays.toString(numB));
    }

}
