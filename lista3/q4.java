import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os valores da matriz A (2x3): ");
        int [][] matrizA = preencherMatriz(2, 3);

        System.out.println("\nDigite os valores da matriz B (3x2): ");
        int [][] matrizB = preencherMatriz(3, 2);

        System.out.println("\nResultado da multiplicação das matrizes (2x2): ");
        int [][] matrizResultado = multiplicarMatrizes(matrizA, matrizB);
        printMatriz(matrizResultado);

        sc.close();
    }

    private static int[][] preencherMatriz(int linhas, int colunas) {
        int[][] matriz = new int[linhas][colunas];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                int linha = i+1;
                int coluna = j+1;
                System.out.print("[" + linha + "][" + coluna + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        return matriz;
    }

    private static int[][] multiplicarMatrizes(int [][] matrizA, int [][] matrizB) {
        int[][] matrizResultado = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrizResultado[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    matrizResultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        return matrizResultado;
    }

    private static void printMatriz(int [][] matriz) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
