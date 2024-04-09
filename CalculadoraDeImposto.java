import java.util.Scanner;

public class CalculadoraDeImposto {

    private Scanner scanner;

    public CalculadoraDeImposto() {
        this.scanner = new Scanner(System.in);
    }

    public double calcular(Imposto imposto, double valorVenda) {
        return imposto.calcular(valorVenda);
    }

    public double solicitarValorVenda() {
        System.out.println("Digite o valor da venda:");
        return scanner.nextDouble();
    }

}