import java.util.Random;

public class App {
    public static void main(String[] args) {
        Carro carro1 = new Carro(1, 0, 0);
        Carro carro2 = new Carro(2, 0, 0);
        int count = 0;

        Pista pista = new Pista(1, 20);

        try {
            System.out.println("Carregando Simulação ...");

	    	Thread.sleep(000);

			Utils.limparTela();

	    	System.out.println("Simulação Iniciada!");
	    	Utils.bordaDaCorrida(pista.getComprimento());
            System.out.println("#");
	    	System.out.println("#");
	    	Utils.bordaDaCorrida(pista.getComprimento());

            while(carro1.getDistancia() < pista.getComprimento() && carro2.getDistancia() < pista.getComprimento()) {
                Thread.sleep(000);
                Utils.limparTela();
                count++;

                System.out.println("Volta " + count);
                Utils.bordaDaCorrida(pista.getComprimento());

                carro1.setVelocidade(Utils.aumentarDistancia());
                carro1.setDistancia(carro1.getDistancia() + carro1.getVelocidade());

                carro2.setVelocidade(Utils.aumentarDistancia());
                carro2.setDistancia(carro2.getDistancia() + carro2.getVelocidade());

                System.out.println(Utils.animacao(carro1.getDistancia()) + "#");
                System.out.println(Utils.animacao(carro2.getDistancia()) + "#");
                Utils.bordaDaCorrida(pista.getComprimento());
            }

            Utils.status(carro1.getDistancia(), carro2.getDistancia());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Thread interrompida durante o soninho, o erro é um tal de " + e.getMessage());
        }

        System.out.println(" ");
    }
	
}
