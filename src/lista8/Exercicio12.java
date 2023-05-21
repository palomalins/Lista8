package lista8;

import java.util.Arrays;


public class Exercicio12 {
    public static void main(String[] args) {
          int numA[] = {1, 4, 9, 16, 25, 36, 49, 64, 81, 100};        
          int numB[] = new int[numA.length];
        int count = 0;
        for (int i = 1; i <= numA.length; i++) {
            numB[count++] = numA[numA.length - i];
        }
        System.out.println(Arrays.toString(numA));
        System.out.println(Arrays.toString(numB));
    }
          
          
          
    }
