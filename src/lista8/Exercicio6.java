package lista8;

import java.util.Arrays;

public class Exercicio6 {

    public static void main(String[] args) {
        int A[] = {29, 8, 90, 52, 37, 23, 45, 77, 13, 66};
        int quantidade = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                quantidade++;
            }
        }
        System.out.printf("Array (A): %s \n", Arrays.toString(A));
        System.out.println("Quantidade de números pares: " + quantidade);
    }
}
