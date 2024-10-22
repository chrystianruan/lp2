import java.util.Scanner;

public class Retangulo {
    private double altura;
    private double largura;

    public void setAltura() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da altura: ");
        try {
            double altura = Double.parseDouble(scanner.nextLine());
            if (altura > 0) {
                this.altura = altura;
            } else {
                System.out.println("Altura deve ser maior que zero.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Valor inválido. Por favor, insira um número.");
        }
    }

    public void setLargura() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da largura: ");
        try {
            double largura = Double.parseDouble(scanner.nextLine());
            if (largura > 0) {
                this.largura = largura;
            } else {
                System.out.println("Largura deve ser maior que zero.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Valor inválido. Por favor, insira um número.");
        }
    }

    public double area() {
        return this.largura * this.altura;
    }

    public double perimetro() {
        return (this.largura * 2) + (this.altura * 2);
    }

    public double getAltura() {
        return this.altura;
    }

    public double getLargura() {
        return this.largura;
    }
}
