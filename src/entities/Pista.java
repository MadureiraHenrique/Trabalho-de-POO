package entities;

public class Pista {
    private final int id;
    private final int comprimento;

    public Pista(int id, int comprimento) {
        this.id = id;
        this.comprimento = comprimento;
    }

    public int getId() {
        return id;
    }

    public int getComprimento() {
        return comprimento;
    }

    public String bordaDaPista() {
        return "-".repeat(this.comprimento);
    }
}
