
package lista8;

import java.util.Arrays;


public class Exercicio8 {
    public static void main(String[] args) {
        int A[] = {7, 8, 90, 52, 37, 23, 45, 77, 13, 66};
        int soma=0, quantidade=0;
        float media;
        for (int i = 0; i <A.length; i++) {
            if (A[i] %2 !=0) {
                soma+=A[i];
                quantidade++;
            }
            
        }
        media=soma/quantidade;
        System.out.printf("Array: %s \n", Arrays.toString(A));
        System.out.println("Média aritimética dos números ímpares do Array: "+media);
        
        
    } 
}
