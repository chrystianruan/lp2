
public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo("Vermelho", true, 5.0);
        Retangulo retangulo = new Retangulo("Azul", false, 4.0, 6.0);
        Quadrado quadrado = new Quadrado("Verde", true, 4.0);

        System.out.println("Informações do Círculo:");
        circulo.exibirInformacoes();

        System.out.println("\nInformações do Retângulo:");
        retangulo.exibirInformacoes();

        System.out.println("\nInformações do Quadrado:");
        quadrado.exibirInformacoes();
    }
}