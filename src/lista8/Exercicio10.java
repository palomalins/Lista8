package lista8;

public class Exercicio10 {

    public static void main(String[] args) {
        int A[] = {7, 8, 55, 52, 37, 23, 45, 97, 13, 66};
        int menor = 1000, maior = -1, imenor=-1, imaior=-1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > maior) {
                maior = A[i];
                imaior=i;
            }
            if (A[i] < menor) {
                menor = A[i];
                imenor=i;
            }
        }
        System.out.println("O menor valor é: "+menor + " e o maior valor é: " + maior);
        System.out.println("O menor valor está na posição: "+imenor+" e o maior está na posição: "+imaior);
    }
}
