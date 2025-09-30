import java.util.Random;

public class App {
    public static void main(String[] args) {
        int distancia = 20;
        int distanciaCarro1 = 0;
        int distanciaCarro2 = 0;
        int count = 0;

        String animacao1 = "";
        String animacao2 = "";
        
        try {
            while(distanciaCarro1 < distancia || distanciaCarro2 < distancia) {
                Thread.sleep(1000);
                limparTela();
                count++;
                System.out.println("volta " + count);
                System.out.println("-------------------------");
                distanciaCarro1 += aumentarDistancia();
                animacao1 = animacao(distanciaCarro1);

                distanciaCarro2 += aumentarDistancia();
                animacao2 = animacao(distanciaCarro2);

                System.out.println(animacao1 + "#");
                System.out.println(animacao2 + "#");
                System.out.println("-------------------------");
            }
    
            status(distanciaCarro1, distanciaCarro2);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Thread interrompida durante o sono, o erro é um tal de : " + e.getMessage());
        }
        System.out.println();
    }

    public static int aumentarDistancia() {
        Random random = new Random();
        return random.nextInt(3);
    }

    public static void status(int carro1, int carro2) {
        System.out.println("(---> Status <---)");
        if (carro1 > carro2) {
            System.out.println("Carro 1 Ganhou!");
        } else if (carro2 > carro1) {
            System.out.println("Carro 2 Ganhou!");
        } else {
            System.out.println("Carro 1 e Carro 2 Empataram!");
        }
        System.out.println("distancia do Carro 1 = " + carro1);
        System.out.println("distancia do Carro 2 = " + carro2);
    }
    
    public static String animacao(int distanciaCarro) {
        String animacao = " ".repeat(distanciaCarro);
        return animacao;
    }

    public static void limparTela() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

}
