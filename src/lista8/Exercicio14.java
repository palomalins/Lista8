
package lista8;

import java.util.Arrays;

public class Exercicio14 {
    public static void main(String[] args) {
        int a[] = { 3, 4, 5, 6, 7 };
        int b[] = new int[5];

        for (int i = 0; i < a.length; i++) {
            int fatorial = 1;
            for (int j = 1; j <= a[i]; j++) {
                fatorial *= j;
                b[i] = fatorial;

            }

        }
        System.out.printf("Array (a): %s \n", Arrays.toString(a));
        System.out.printf("Array(b) fatorial de a:  %s \n", Arrays.toString(b));

    }
}
