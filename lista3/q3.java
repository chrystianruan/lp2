/******************************************************************************

 Online Java Compiler.
 Code, Compile, Run and Debug java program online.
 Write your code in this editor and press "Run" button to execute it.

 *******************************************************************************/
import java.util.Scanner;

public class q3
{
    public static void main(String[] args) {
        System.out.println("Digite os valores da matriz 5x5");

        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int linha = i+1;
                int coluna = j+1;
                System.out.println("Digite o valor da posição "+linha+""+coluna);
                int valor = sc.nextInt();
                matriz[i][j] = valor;
            }
        }

        int maiorValor = 0;
        int linha = 0;
        int coluna = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                    linha = i+1;
                    coluna = j+1;
                }
            }
        }

        System.out.println("Maior valor:" + maiorValor + " || " +  "Linha: " + linha + ", Coluna:" + coluna );
    }
}