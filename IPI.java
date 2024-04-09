public class IPI implements Imposto {

    @Override
    public double calcular(double valorVenda) {
        return valorVenda * 0.20;
    }

}