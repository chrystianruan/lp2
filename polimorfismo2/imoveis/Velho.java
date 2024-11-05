public class Velho extends Imovel {
    private double descontoPreco;

    public Velho(String endereco, double preco, double descontoPreco) {
        super(endereco, preco);
        this.descontoPreco = descontoPreco;
    }

    public double getDescontoPreco() {
        return descontoPreco;
    }

    public void setDescontoPreco(double descontoPreco) {
        this.descontoPreco = descontoPreco;
    }

    public void imprimirDesconto() {
        System.out.println("Desconto no preço: R$ " + descontoPreco);
    }

    @Override
    public void imprimirDetalhes() {
        super.imprimirDetalhes();
        System.out.println("Preço com desconto: R$ " + (getPreco() - descontoPreco));
    }
}