class VIP extends Ingresso {
    private double adicional;

    public VIP(double valor, double adicional) {
        super(valor);
        this.adicional = adicional;
    }

    public double getValorVIP() {
        return getValor() + adicional;
    }
}
