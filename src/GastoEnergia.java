import java.util.Scanner;

public class GastoEnergia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ENTRADA
        System.out.println("Insira o valor do salario minimo: ");
        double salMin = sc.nextDouble();
        System.out.println("Insira a quantidade de kW consumida: ");
        double consumoKw = sc.nextDouble();

        // "PROCESSAMENTO"
        double valor1kW = calcularValor1Kw(salMin);
        double contaTotal = calcularConta(consumoKw, valor1kW);
        double contaDesconto = calcularContaDesconto(contaTotal);

        // SAIDA
        System.out.printf("O valor de cada kW e de: R$%.2f\n", valor1kW);
        System.out.printf("O valor da sua conta e de: R$%.2f\n", contaTotal);
        System.out.printf("O valor da sua conta com 10%% de desconto e de: R$%.2f\n", contaDesconto);

        sc.close();
    }

    // METODO 1
    public static double calcularValor1Kw(double salMin) {
        double valor100kW = (salMin / 7);
        return valor100kW / 100;
    }

    // METODO 2
    public static double calcularConta(double consumoKw, double valor1kW) {
        return (consumoKw * valor1kW);
    }

    // METODO 3
    public static double calcularContaDesconto(double contaTotal) {
        return (contaTotal * 0.9);
    }
}