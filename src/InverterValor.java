import java.util.Scanner;

public class InverterValor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor, valorInvertido;

        System.out.println("Digite um numero: ");
        valor = sc.nextInt();

        if (valor == 000) {
            System.out.println("Favor inserir um numero diferente de 0");
        } else if (valor > 999 || valor < 99) {
            System.out.println("Favor inserir um numero de 3 digitos");
        } else {
            valorInvertido = inversorDeValor(valor);

            System.out.println("Seu valor invertido e: " + valorInvertido);
        }

        sc.close();
    }
    public static int inversorDeValor (int valor) {
        int u = valor % 10;
        int d = (valor / 10) % 10;
        int c = valor / 100;
        return (u * 100) + (d * 10) + c;
    }
}
