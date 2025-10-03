package application;

import Utils.Utils;
import entities.Carro;
import entities.Pista;

public class App {
    public static void main(String[] args) {
        Pista pista = new Pista(1, 20);
        Carro carro1 = new Carro(1, 0, 0);
        Carro carro2 = new Carro(2, 0, 0);

        int count = 0;


        try {
            System.out.println("Carregando Simulação ...");

	    	Thread.sleep(5000);

			Utils.limparTela();

	    	System.out.println("Simulação Iniciada!");
            System.out.println(pista.bordaDaPista());
            System.out.println("#");
	    	System.out.println("#");
            System.out.println(pista.bordaDaPista());

            while(carro1.getDistancia() < pista.getComprimento() && carro2.getDistancia() < pista.getComprimento()) {
                Thread.sleep(1000);
                Utils.limparTela();
                count++;

                System.out.println("loop " + count);
                System.out.println(pista.bordaDaPista());

                carro1.setVelocidade(Utils.aumentarDistancia());
                carro1.setDistancia(carro1.getDistancia() + carro1.getVelocidade());

                carro2.setVelocidade(Utils.aumentarDistancia());
                carro2.setDistancia(carro2.getDistancia() + carro2.getVelocidade());

                System.out.println(Utils.animacao(carro1.getDistancia()) + "#");
                System.out.println(Utils.animacao(carro2.getDistancia()) + "#");
                System.out.println(pista.bordaDaPista());
            }

            Utils.status(carro1.getDistancia(), carro2.getDistancia());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Thread interrompida durante o soninho, o erro é um tal de " + e.getMessage());
        }

        System.out.println(" ");
    }
	
}
