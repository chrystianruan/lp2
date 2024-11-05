public class Main {
    public static void main(String[] args) {

        Normal ingressoNormal = new Normal(50);
        System.out.println("Detalhes do Ingresso Normal:");
        ingressoNormal.imprimeValor();
        ingressoNormal.imprimeIngressoNormal();

        System.out.println();

        VIP ingressoVIP = new VIP(50, 30);
        System.out.println("Detalhes do Ingresso VIP:");
        ingressoVIP.imprimeValor();
        System.out.println("Valor do ingresso VIP: R$ " + ingressoVIP.getValorVIP());

        System.out.println();

        CamaroteInferior ingressoCamaroteInferior = new CamaroteInferior(50, 30, "Setor A");
        System.out.println("Detalhes do Ingresso Camarote Inferior:");
        ingressoCamaroteInferior.imprimeValor();
        System.out.println("Valor do ingresso Camarote Inferior: R$ " + ingressoCamaroteInferior.getValorVIP());
        ingressoCamaroteInferior.imprimeLocalizacao();

        System.out.println();

        CamaroteSuperior ingressoCamaroteSuperior = new CamaroteSuperior(50, 30, 20);
        System.out.println("Detalhes do Ingresso Camarote Superior:");
        ingressoCamaroteSuperior.imprimeValor();
        System.out.println("Valor do ingresso Camarote Superior: R$ " + ingressoCamaroteSuperior.getValorCamaroteSuperior());
    }
}