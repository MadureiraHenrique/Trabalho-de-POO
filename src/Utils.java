import java.util.Random;

public class Utils {
    public static int aumentarDistancia() {
        Random random = new Random();
        return random.nextInt(1, 4);
    }

    public static void status(int carro1, int carro2) {
        System.out.println("\n(---> Status <---)");
        if (carro1 > carro2) {
            System.out.println("Carro 1 Ganhou!");
        } else if (carro2 > carro1) {
            System.out.println("Carro 2 Ganhou!");
        } else {
            System.out.println("Carro 1 e Carro 2 Empataram!");
        }
        System.out.println("Distancia do Carro 1 = " + carro1);
        System.out.println("Distancia do Carro 2 = " + carro2);
    }

    public static String animacao(int distanciaCarro) {
        String animacao = " ".repeat(distanciaCarro);
        return animacao;
    }

    public static void limparTela() {
        System.out.println("\n".repeat(10));
    }

    public static void bordaDaCorrida(int distancia) {
        System.out.println("-".repeat(distancia));
    }
}
