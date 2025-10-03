package Utils;

import entities.Carro;

import java.util.Random;

public class Utils {
    public static int aumentarVelocidade() {
        Random random = new Random();
        return random.nextInt(1, 4);
    }

    public static void status(Carro carro1, Carro carro2) {
        System.out.println("\n(---> Status <---)");
        if (carro1.getDistancia() > carro2.getDistancia()) {
            System.out.println("Carro " + carro1.getId() + " Ganhou!");
        } else if (carro2.getDistancia() > carro1.getDistancia()) {
            System.out.println("Carro " + carro2.getId() + " Ganhou!");
        } else {
            System.out.println("Carro " + carro1.getId() + " e Carro " + carro2.getId() + " Empataram!");
        }
        System.out.println("Distancia do Carro 1 = " + carro1.getDistancia());
        System.out.println("Distancia do Carro 2 = " + carro2.getDistancia());
    }

    public static String animacao(int distanciaCarro) {
        return " ".repeat(distanciaCarro);
    }

    public static void limparTela() {
        System.out.println("\n".repeat(10));
    }

    public static String bordaDaCorrida(int distancia) {
        return "-".repeat(distancia);
    }
}
