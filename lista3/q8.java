import java.util.Random;

public class q8 {

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

    public static int somaAbaixoDiagonal(int[][] matriz) {
        int soma = 0;

        for (int i = 1; i < 3; i++) {
            for (int j = 0; j < i; j++) {
                soma += matriz[i][j];
            }
        }

        return soma;
    }

    public static void main(String[] args) {
        int[][] matriz = gerarMatrizAleatoria();
        int soma = somaAbaixoDiagonal(matriz);
        System.out.println("A soma dos elementos abaixo da diagonal principal é: " + soma);
    }
}
