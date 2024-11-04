abstract class Figura {
    protected String cor;
    protected boolean filled;

    public Figura(String cor, boolean filled) {
        this.cor = cor;
        this.filled = filled;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Métodos abstratos para cálculo de área e perímetro
    public abstract double getArea();
    public abstract double getPerimetro();

    // Método para exibir informações da figura
    public void exibirInformacoes() {
        System.out.println("Cor: " + cor);
        System.out.println("Preenchido: " + (filled ? "Sim" : "Não"));
        System.out.println("Área: " + getArea());
        System.out.println("Perímetro: " + getPerimetro());
    }
}