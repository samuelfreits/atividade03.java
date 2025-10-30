public class Contato {
    private String tipo;
    private String valor;

    public Contato(String tipo, String valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public String getValor() {
        return valor;
    }

    public String toString() {
        return tipo + ": " + valor;
    }
}