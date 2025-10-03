package entities;

public class Carro {
    private final int id;
    private int velocidade;
    private int distancia;

    public Carro(int id, int velocidade, int distancia) {
        this.id = id;
        this.velocidade = velocidade;
        this.distancia = distancia;
    }

    public int getId() {
        return id;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
}
