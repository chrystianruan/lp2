import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] notasBimestre1 = new double[2];
        double[] notasBimestre2 = new double[2];

        System.out.println("Digite as notas do 1º bimestre:");
        for (int i = 0; i < 2; i++) {
            int indice = i+1;
            System.out.println("Nota da prova " + indice + ":" );
            notasBimestre1[i] = input.nextDouble();
        }

        System.out.println("Digite as notas do 2º bimestre:");
        for (int i = 0; i < 2; i++) {
            int indice = i+1;
            System.out.println("Nota da prova " + indice + ":" );
            notasBimestre2[i] = input.nextDouble();
        }

        double mediaBimestre1 = (notasBimestre1[0] + notasBimestre1[1]) / 2;
        double mediaBimestre2 = (notasBimestre2[0] + notasBimestre2[1]) / 2;

        double notaSemestral = (mediaBimestre1 + mediaBimestre2) / 2;

        System.out.println("Nota Semestral: " + notaSemestral);
    }
}