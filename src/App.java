import java.util.Random;

public class App {
    public static void main(String[] args) {
        int distanciaCarro1 = 0, distanciaCarro2 = 0, count = 0, distancia = 20;

        String animacao1 = "", animacao2 = "";

        try {
	    	println("Carregando Simulação ...");

	    	Thread.sleep(5000);

			limparTela();

	    	println("Simulação Iniciada!");
	    	println("-".repeat(distancia));
            println("#");
	    	println("#");
	    	println("-".repeat(distancia));

            while(distanciaCarro1 < distancia && distanciaCarro2 < distancia) {
                Thread.sleep(1000);
                limparTela();
                count++;

                println("Volta " + count);
                println("-".repeat(distancia));
                distanciaCarro1 += aumentarDistancia();
                animacao1 = animacao(distanciaCarro1);

                distanciaCarro2 += aumentarDistancia();
                animacao2 = animacao(distanciaCarro2);

                println(animacao1 + "#");
                println(animacao2 + "#");
                println("-".repeat(distancia));
            }

            status(distanciaCarro1, distanciaCarro2);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            println("Thread interrompida durante o soninho, o erro é um tal de " + e.getMessage());
        }

        println(" ");
    }

    public static int aumentarDistancia() {
        Random random = new Random();
        return random.nextInt(1, 4);
    }

    public static void status(int carro1, int carro2) {
        println("\n(---> Status <---)");
        if (carro1 > carro2) {
            println("Carro 1 Ganhou!");
        } else if (carro2 > carro1) {
            println("Carro 2 Ganhou!");
        } else {
            println("Carro 1 e Carro 2 Empataram!");
        }
        println("Distancia do Carro 1 = " + carro1);
        println("Distancia do Carro 2 = " + carro2);
    }

    public static String animacao(int distanciaCarro) {
        String animacao = " ".repeat(distanciaCarro);
        return animacao;
    }

    public static void limparTela() {
        println("\n".repeat(10));
    }

    public static void println(Object o) {
		System.out.println(o);
    }

}
