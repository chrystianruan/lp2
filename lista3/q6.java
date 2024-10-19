public class q6 {

    public static void main(String[] args) {
        int[][] matriz = preencherMatriz();

        imprimirMatriz(matriz);
    }

    public static int[][] preencherMatriz() {
        int[][] matriz = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz) {
        System.out.println("Matriz 5x5 com diagonal principal preenchida com 1:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
