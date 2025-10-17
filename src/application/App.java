package application;

import java.util.Scanner;

import Utils.Utilidades;
import entities.Carro;
import entities.Pista;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pista pista = new Pista(1, 20);
        
        int count = 0;
        
        try {
            System.out.println("--> Corrida de Carros <--");
            System.out.print("Quantos carros são? ");
            int quantidadeDeCarros = scan.nextInt();
            
            Carro[] carro = new Carro[quantidadeDeCarros];
            int[] distancia = new int[quantidadeDeCarros];

            for (int novoId = 0; novoId < quantidadeDeCarros; novoId++) {
                Carro novoCarro = new Carro(novoId, 0, 0);
                carro[novoId] = novoCarro;
            }

            System.out.println("São " + quantidadeDeCarros + " Carros.");
            
            System.out.println("Carregando Simulação ...");
            
	    	Thread.sleep(1000);
            
			Utilidades.limparTela();
            
	    	System.out.println("Simulação Iniciada!");
            System.out.println(pista.bordaDaPista());
	    	System.out.println("#".repeat(quantidadeDeCarros));
            System.out.println(pista.bordaDaPista());
            
            while(!Utilidades.verificador(carro, pista.getComprimento())) { // aqui vai ter um verificador(carro[]) que retorna true se algum carro chegar ao final.    
                Thread.sleep(500);
                Utilidades.limparTela();
                count++;
                
                System.out.println("loop " + count);
                System.out.println(pista.bordaDaPista());
                
                // aqui vai ter um loop(foreach) para setar a velocidade e a distância.
                for (Carro carros1 : carro) {
                    carros1.setDistancia(Utilidades.aumentarVelocidade());
                    carros1.setVelocidade(carros1.aumentarDistancia());
                }

                // aqui vai ter um loop(foreach) para mostrar todas as animações.
                for (Carro carros2 : carro) {
                    distancia[carros2.getId()] += carros2.getDistancia();
                    System.out.println(Utilidades.animacao(distancia[carros2.getId()]) + "#");
                    carros2.setDistancia(distancia[carros2.getId()]);
                }

                System.out.println(pista.bordaDaPista());
            }

            Utilidades.status(carro);

            scan.close();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Thread interrompida durante o soninho, o erro é um tal de " + e.getMessage());
        }
        
        System.out.println(" ");
    }
	
}
