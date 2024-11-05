class CamaroteSuperior extends VIP {
    private double adicionalCamarote;

    public CamaroteSuperior(double valor, double adicional, double adicionalCamarote) {
        super(valor, adicional);
        this.adicionalCamarote = adicionalCamarote;
    }

    public double getValorCamaroteSuperior() {
        return getValorVIP() + adicionalCamarote;
    }
}