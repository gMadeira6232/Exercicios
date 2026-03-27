import java.util.Scanner;
import java.util.Locale;

public class SalarioInss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double valorHoraAula, horasTrabalhadas, descontoInss, valorBruto, porcentagemInss, salarioLiquido;

        System.out.println("Digite o valor da hora-aula: ");
        valorHoraAula = sc.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas: ");
        horasTrabalhadas = sc.nextDouble();

        System.out.println("Digite o valor da porcentagem de desconto INSS: ");
        porcentagemInss = sc.nextDouble();

        porcentagemInss = calculadoraPorcentagem(porcentagemInss);
        valorBruto = calculadoraValorBruto(valorHoraAula, horasTrabalhadas);
        descontoInss = calculadoraDescontoInss(valorBruto, porcentagemInss);
        salarioLiquido = calculadoraSalarioLiquido(valorBruto, descontoInss);


        System.out.printf("O valor do salario liquido é de R$: %.2f", salarioLiquido);

        sc.close();
    }

    //  METODO 1
    public static double calculadoraPorcentagem(double porcentagemInss) {
        return porcentagemInss = porcentagemInss / 100;
    }

    //  METODO 2
    public static double calculadoraValorBruto(double valorHoraAula, double horasTrabalhadas) {
        return valorHoraAula * horasTrabalhadas;
    }

    //  METODO 3
    public static double calculadoraDescontoInss(double valorBruto, double porcentagemInss) {
        return valorBruto * porcentagemInss;
    }
    //  METODO 4
    public static double calculadoraSalarioLiquido(double valorBruto, double descontoInss) {
        return valorBruto - descontoInss;
    }
}