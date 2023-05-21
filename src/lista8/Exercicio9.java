
package lista8;


public class Exercicio9 {
    public static void main(String[] args) {
          int A[] = {7, 8, 90, 52, 37, 23, 45, 77, 13, 66, 30, 89, 92, 3, 78, 16, 39, 27, 11, 99, 69};
          int soma1=0, soma2=0, quantidade=0;
          float media=0;
          
          for (int i = 0; i <A.length; i++) {
              if (A[i]<15) {
                  soma1+=A[i]; 
              }
              else{
                  soma2+=A[i];
                  quantidade++;
                  media=soma2/quantidade;
              }
       
          }
          
           
              System.out.println("Soma de todos os números menores que 15: "+soma1);
              System.out.println("Média aritimética de todos os números maiores que 15: "+media);
    }
 
}
