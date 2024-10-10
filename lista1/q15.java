import java.util.Scanner;

public class VolumeCaixaRetangular {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double comprimento = input.nextDouble();
        double largura = input.nextDouble();
        double altura = input.nextDouble();

        double volume = comprimento * largura * altura;

        System.out.println(volume);
    }
}