import java.util.Scanner;

public class CalculoCombustivel {
    public static void main(String[] args) {
        int tempo;
        double velocidade, distancia, consumo;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o tempo da viagem (horas): ");
        tempo = sc.nextInt();

        System.out.println("Informe a velocidade media (km/h): ");
        velocidade = sc.nextDouble();

        sc.close();

        distancia = velocidade * tempo;
        consumo = distancia / 10.5;

        System.out.println("A quantidade de combustível gasta sera de: " + consumo + " Litros");
    }

    // ADICIONAR METODOS

}