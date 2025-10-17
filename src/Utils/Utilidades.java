package Utils;

import entities.Carro;

import java.util.Random;

public class Utilidades {
    public static int aumentarVelocidade() {
        Random random = new Random();
        return random.nextInt(1, 4);
    }

    public static void status(Carro[] carro) { // Aqui deve ter um loop que verifica (Se ganhou ou se empatou) todos os carros.
        // vai ter um duplo for, para leitura de carro1 = i, carro2 = j;
        System.out.println("\n(---> Status <---)"); 
        for (int i = 0; i < carro.length; i++) {
                // System.out.println("Distancia do Carro " + carro1.getId() + " = " + carro1.getDistancia());
                Carro carro1 = carro[i];
                Carro carro2 = carro[(i + 1)];
                if (carro1.getDistancia() > carro2.getDistancia()) {
                    System.out.println("Carro " + carro1.getId() + " Ganhou!");
                } else if (carro2.getDistancia() > carro1.getDistancia()) {
                    System.out.println("Carro " + carro1.getId() + " Perdeu!");
                } else {
                    System.out.println("Carro " + carro1.getId() + " e Carro " + carro2.getId() + " Empataram!");
                }
        }
        
        System.out.println("\n(--> Distâncias <--)");
        for(int i = 0; i < carro.length; i++) {
            Carro carro1 = carro[i];
            System.out.println("Distancia do Carro " + carro1.getId() + " = " + carro1.getDistancia());
        }
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

    public static boolean verificador(Carro[] carro, int comprimento) {
        for (int i = 0; i < carro.length; i++) {
            for (int j = 0; j < carro.length; j++) {
                if (carro[i].getDistancia() > comprimento) {
                    return true;
                }
            }
        }
        return false;
    } 
}
