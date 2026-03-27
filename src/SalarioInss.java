import java.util.Scanner;
import java.util.Locale;

public class SalarioInss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double valorHoraAula, horasTrabalhadas,porcentagemInss, salarioLiquido;

        System.out.println("Digite o valor da hora-aula: ");
        valorHoraAula = sc.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas: ");
        horasTrabalhadas = sc.nextDouble();

        System.out.println("Digite o valor da porcentagem de desconto INSS: ");
        porcentagemInss = sc.nextDouble();

        salarioLiquido = calculadoraSalarioLiquido(porcentagemInss / 100, valorHoraAula, horasTrabalhadas);

        System.out.printf("O valor do salario liquido é de R$: %.2f", salarioLiquido);

        sc.close();
    }
    //  METODO 4
    public static double calculadoraSalarioLiquido(double porcentagemInss, double valorHoraAula, double horasTrabalhadas) {
        double salBruto = valorHoraAula * horasTrabalhadas;
        double descontoInss = salBruto * porcentagemInss;
        return salBruto - descontoInss;
    }
}