import java.util.Scanner;

public class ConsumoCombustivel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double tempo = input.nextDouble();
        double velocidade = input.nextDouble();

        double distancia = tempo * velocidade;
        double litrosGastos = distancia / 12;

        System.out.println(litrosGastos);
    }
}