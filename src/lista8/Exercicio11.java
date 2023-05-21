package lista8;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        float nota1[] = new float[10];
        float nota2[] = new float[10];
        float resultado[] = new float[10];
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < nota1.length; i++) {
            System.out.println("Digite a primeira nota do aluno:");
            nota1[i] = entrada.nextFloat();
            System.out.println("Digite a segunda nota do aluno:");
            nota2[i] = entrada.nextFloat();
            resultado[i] = ((nota1[i] + nota2[i]) / 2);
            if (resultado[i] >= 7) {
                System.out.println("A média do aluno é: " + resultado[i]);
                System.out.println("O aluno está aprovado\n");
            }
            if (resultado[i] > 4 && resultado[i] < 7) {
                System.out.println("A média do aluno é: " + resultado[i]);
                System.out.println("O aluno está em recuperação\n");
            }
            if (resultado[i] <= 4) {
                System.out.println("A média do aluno é: " + resultado[i]);
                System.out.println("O aluno está reprovado\n");
            }

        }
    }
    }

