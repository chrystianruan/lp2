class Quadrado extends Retangulo {
    public Quadrado(String cor, boolean filled, double lado) {
        super(cor, filled, lado, lado);
    }

    public double getLado() {
        return getLargura();
    }

    public void setLado(double lado) {
        setLargura(lado);
        setAltura(lado);
    }
}