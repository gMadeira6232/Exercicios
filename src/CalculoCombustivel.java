import java.util.Scanner;

public class CalculoCombustivel {
    public static void main(String[] args) {
        int tempo;
        double velocidade, consumo;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o tempo da viagem (horas): ");
        tempo = sc.nextInt();

        System.out.println("Informe a velocidade media (km/h): ");
        velocidade = sc.nextDouble();

        consumo = calculadoraConsumo(velocidade, tempo);

        System.out.printf("A quantidade de combustível gasta sera de: %.2f %s", consumo, "Litros");

        sc.close();
    }

    // METODO
    public static double calculadoraConsumo(double velocidade, double tempo) {
        double distancia = velocidade * tempo;
        return distancia / 10.5;
    }
}