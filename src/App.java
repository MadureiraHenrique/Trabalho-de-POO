import java.util.Random;

public class App {
    static void main() {
        int distancia = 20;
        int carro1 = 0;
        int carro2 = 0;
        
        String animacao1 = "";
        String animacao2 = "";
        
        try {
            for (int i = 0; i < distancia; i++) {
                Thread.sleep(1000);
                IO.println("Corrida " + i);
                int cache = 0;
                IO.println("--------------------");
                if (carro1 == distancia) {
                    i = distancia;
                } else if (carro2 == distancia) {
                    i = distancia;
                } else {
                    cache = carro1;
                    carro1 += aumentarVelocidade();
                    animacao1 += animacao(carro1 - cache);
    
                    cache = carro2;
                    carro2 += aumentarVelocidade();
                    animacao2 += animacao(carro2 - cache);
                    
                    IO.println(animacao1 + "#");
                    IO.println(animacao2 + "#");
                }
                IO.println("--------------------");
            }
            limparTela();
    
            status(carro1, carro2);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            IO.println("Thread interrompida durante o sono, o erro é um tal de : " + e.getMessage());
        }

    }

    public static int aumentarVelocidade() {
        Random random = new Random();
        return random.nextInt(3);
    }

    public static void status(int carro1, int carro2) {
        IO.println("(---> Status <---)");
        if (carro1 > carro2) {
            IO.println("Carro 1 Ganhou!");
        } else if (carro2 > carro1) {
            IO.println("Carro 2 Ganhou!");
        } else {
            IO.println("Carro 1 e Carro 2 Empataram!");
        }
        IO.println("Velocidade do Carro 1 = " + carro1);
        IO.println("Velocidade do Carro 2 = " + carro2);
    }
    
    public static String animacao(int carro) {
        String acrescentar = "";
        for (int i = 0; i < carro; i++) {
            acrescentar += " ";
        }
        return acrescentar;
    }

    public static void limparTela() {
        for (int i = 0; i < 50; i++) {
            IO.println();
        }
    }

}
