import java.util.Scanner;

public class ExpressaoComIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y, xQuadrado;

        System.out.println("Informe o valor de X: ");
        x = sc.nextDouble();

        if (x > 5 || x < -5) {
            y = 8 / Math.sqrt(x * x - 25);
            System.out.println("O valor de y é: " + y);
        } else {
            System.out.println("Insira um valor válido");
        }
    }
}