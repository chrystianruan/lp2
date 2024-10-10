import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int diasTotais = input.nextInt();

        int anos = diasTotais / 365;
        int meses = (diasTotais % 365) / 30;
        int dias = (diasTotais % 365) % 30;

        System.out.println(anos + " anos, " + meses + " meses e " + dias + " dias");
    }
}