package lista8;

import java.util.Arrays;

public class Exercicio5 {

    public static void main(String[] args) {
        int A[] = {29, 28, 27, 26, 25, 24, 23, 22, 21, 20};
        int B[] = {30, 89, 92, 3, 77, 15, 30, 27, 11, 99, 69};
        int C[] = new int[10];

        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] + B[i];
        }

        System.out.printf("Array: %s \n", Arrays.toString(A));
        System.out.printf("Array: %s \n", Arrays.toString(B));
        System.out.printf("Array: %s \n", Arrays.toString(C));

    }
}
