public class Novo extends Imovel {
    private double adicionalPreco;

    public Novo(String endereco, double preco, double adicionalPreco) {
        super(endereco, preco);
        this.adicionalPreco = adicionalPreco;
    }

    public double getAdicionalPreco() {
        return adicionalPreco;
    }

    public void setAdicionalPreco(double adicionalPreco) {
        this.adicionalPreco = adicionalPreco;
    }

    public void imprimirAdicional() {
        System.out.println("Adicional no preço: R$ " + adicionalPreco);
    }

    @Override
    public void imprimirDetalhes() {
        super.imprimirDetalhes();
        System.out.println("Preço com adicional: R$ " + (getPreco() + adicionalPreco));
    }
}
