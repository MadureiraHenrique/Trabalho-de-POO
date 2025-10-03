package Utils;

import java.util.Random;

public class Utils {
    public static int aumentarDistancia() {
        Random random = new Random();
        return random.nextInt(1, 4);
    }

    public static void status(int carro1, int carro2) {
        System.out.println("\n(---> Status <---)");
        if (carro1 > carro2) {
            System.out.println("entities.Carro 1 Ganhou!");
        } else if (carro2 > carro1) {
            System.out.println("entities.Carro 2 Ganhou!");
        } else {
            System.out.println("entities.Carro 1 e entities.Carro 2 Empataram!");
        }
        System.out.println("Distancia do entities.Carro 1 = " + carro1);
        System.out.println("Distancia do entities.Carro 2 = " + carro2);
    }

    public static String animacao(int distanciaCarro) {
        String animacao = " ".repeat(distanciaCarro);
        return animacao;
    }

    public static void limparTela() {
        System.out.println("\n".repeat(10));
    }

    public static String bordaDaCorrida(int distancia) {
        return "-".repeat(distancia);
    }
}
