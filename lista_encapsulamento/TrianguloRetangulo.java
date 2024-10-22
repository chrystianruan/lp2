import java.util.Scanner;

public class TrianguloRetangulo {
    private double catetoBase;
    private double catetoAltura;
    private double hipotenusa;

    public void setCatetoBase() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do cateto base: ");
        try {
            double base = Double.parseDouble(scanner.nextLine());
            if (base > 0) {
                this.catetoBase = base;
            } else {
                System.out.println("O cateto base deve ser maior que zero.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Valor inválido. Por favor, insira um número.");
        }
    }

    public void setCatetoAltura() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do cateto altura: ");
        try {
            double altura = Double.parseDouble(scanner.nextLine());
            if (altura > 0) {
                this.catetoAltura = altura;
            } else {
                System.out.println("O cateto altura deve ser maior que zero.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Valor inválido. Por favor, insira um número.");
        }
    }

    public void calcularHipotenusa() {
        this.hipotenusa = Math.sqrt(Math.pow(this.catetoBase, 2) + Math.pow(this.catetoAltura, 2));
    }

    public void mostrarHipotenusa() {
        System.out.println("O valor da hipotenusa é: " + this.hipotenusa);
    }

    public double calcularArea() {
        return (this.catetoBase * this.catetoAltura) / 2;
    }

    public double calcularPerimetro() {
        return this.catetoBase + this.catetoAltura + this.hipotenusa;
    }

    public double getCatetoBase() {
        return this.catetoBase;
    }

    public double getCatetoAltura() {
        return this.catetoAltura;
    }

    public double getHipotenusa() {
        return this.hipotenusa;
    }
}
