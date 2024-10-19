import java.util.Scanner;

public class q10 {

    public static void main(String[] args) {
        char[][] tabuleiro = new char[8][8];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tabuleiro[i][j] = '-';
            }
        }

        System.out.print("Digite o número da linha (1 a 8): ");
        int linha = sc.nextInt() - 1;
        System.out.print("Digite o número da coluna (1 a 8): ");
        int coluna = sc.nextInt() - 1;

        if (linha < 0 || linha > 7 || coluna < 0 || coluna > 7) {
            System.out.println("Posição inválida!");
            return;
        }

        marcarMovimentos(tabuleiro, linha, coluna);
        exibirTabuleiro(tabuleiro);
    }

    public static void marcarMovimentos(char[][] tabuleiro, int linha, int coluna) {
        for (int i = 0; i < 8; i++) {
            tabuleiro[linha][i] = 'X';
        }

        for (int i = 0; i < 8; i++) {
            tabuleiro[i][coluna] = 'X';
        }

//        tabuleiro[linha][coluna] = 'x';
    }

    public static void exibirTabuleiro(char[][] tabuleiro) {
        System.out.println("Tabuleiro de Xadrez:");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
    }
}
