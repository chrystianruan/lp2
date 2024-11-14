class Homem extends PessoaIMC {
    public Homem() {
    }

    @Override
    public String resultIMC() {
        double imc = calculaIMC(peso, altura);
        if (imc < 20.7) {
            return "Abaixo do peso";
        } else if (imc <= 26.4) {
            return "Peso ideal";
        } else {
            return "Acima do peso";
        }
    }
}
