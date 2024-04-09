public class ICMS implements Imposto {

    @Override
    public double calcular(double valorVenda) {
        return valorVenda * 0.10;
    }

}