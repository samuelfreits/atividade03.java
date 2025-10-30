import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private List<Contato> contatos;

    public Pessoa(String nome) {
        this.nome = nome;
        this.contatos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void addContato(Contato c) {
        contatos.add(c);
    }

    public Contato[] getContatos() {
        return contatos.toArray(new Contato[0]);
    }

    public Contato[] getContatos(String tipo) {
        return contatos.stream().filter(c -> c.getTipo().equalsIgnoreCase(tipo)).toArray(Contato[]::new);
    }

    public boolean possuiEmail() {
        return contatos.stream().anyMatch(c -> c.getTipo().equalsIgnoreCase("email"));
    }

    public boolean possuiTelefone() {
        return contatos.stream().anyMatch(c -> c.getTipo().equalsIgnoreCase("telefone"));
    }

    public void exibirContatos() {
        System.out.println("Pessoa: " + nome);
        for (Contato c : contatos) System.out.println(" - " + c);
    }
}
