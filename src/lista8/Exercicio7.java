package lista8;

import java.util.Arrays;

public class Exercicio7 {

    public static void main(String[] args) {
        int A[] = {7, 8, 90, 52, 37, 23, 45, 77, 13, 66};
        int soma = 0;

        for (int i = 0; i < A.length; i++) {
            soma += A[i];
        }

        System.out.printf("Array(A): %s \n", Arrays.toString(A));
        System.out.println("Soma do Array(A): " + soma);
    }

}
