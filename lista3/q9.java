import java.util.Random;

public class q9 {

    public static void main(String[] args) {
        int[][] matriz = gerarMatrizAleatoria();
        int soma = somaDiagonalPrincipal(matriz);
        System.out.println("A soma dos elementos na diagonal principal é: " + soma);
    }

    public static int[][] gerarMatrizAleatoria() {
        Random random = new Random();
        int[][] matriz = new int[3][3];

        System.out.println("Matriz 3x3 gerada aleatoriamente:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = random.nextInt(100);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        return matriz;
    }

    public static int somaDiagonalPrincipal(int[][] matriz) {
        int soma = 0;

        for (int i = 0; i < 3; i++) {
            soma += matriz[i][i];
        }

        return soma;
    }

}
