package lista8;

/**
 *
 * @author chris
 */
public class Exercicio13 {
    public static void main(String[] args) {
        int tabuada[]={9, 8, 7, 6,5};
        for (int i = 0; i <tabuada.length; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.println(+ tabuada[i]+ " x "+ j + " = "+(tabuada[i]*j)+"\n");
            }
        }
    }
}
