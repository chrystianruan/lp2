public class Main {
    public static void main(String[] args) {

        Novo imovelNovo = new Novo("Rua das Flores, 123", 500000, 50000);
        System.out.println("Detalhes do Imóvel Novo:");
        imovelNovo.imprimirDetalhes();
        imovelNovo.imprimirAdicional();

        System.out.println();

        Velho imovelVelho = new Velho("Avenida Principal, 456", 400000, 30000);
        System.out.println("Detalhes do Imóvel Velho:");
        imovelVelho.imprimirDetalhes();
        imovelVelho.imprimirDesconto();
    }
}
