public class TesteCalculadora {

    public static void main(String[] args) {
        CalculadoraDeImposto calculadora = new CalculadoraDeImposto();
        double valorVenda = calculadora.solicitarValorVenda();
        ICMS icms = new ICMS();
        IPI ipi = new IPI();
        System.out.println("ICMS: " + calculadora.calcular(icms, valorVenda));
        System.out.println("IPI: " + calculadora.calcular(ipi, valorVenda));
    }

}