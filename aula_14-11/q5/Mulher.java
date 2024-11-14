class Mulher extends PessoaIMC {
    public Mulher() {
    }

    @Override
    public String resultIMC() {
        double imc = calculaIMC(peso, altura);
        if (imc < 19.1) {
            return "Abaixo do peso";
        } else if (imc <= 25.8) {
            return "Peso ideal";
        } else {
            return "Acima do peso";
        }
    }
}