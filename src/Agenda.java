import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Pessoa> pessoas;

    public Agenda() {
        pessoas = new ArrayList<>();
    }

    public void addPessoa(Pessoa p) {
        pessoas.add(p);
    }

    public Pessoa buscarPessoa(String nome) {
        for (Pessoa p : pessoas)
            if (p.getNome().equalsIgnoreCase(nome))
                return p;
        return null;
    }

    public void addContato(String nome, Contato c) {
        Pessoa p = buscarPessoa(nome);
        if (p != null) p.addContato(c);
    }

    public void exibirTodasPessoas() {
        for (Pessoa p : pessoas) p.exibirContatos();
    }

    public void exibirContatosPessoa(String nome) {
        Pessoa p = buscarPessoa(nome);
        if (p != null) p.exibirContatos();
    }

    public void exibirPessoasComEmail() {
        for (Pessoa p : pessoas)
            if (p.possuiEmail())
                System.out.println(p.getNome());
    }

    public void recuperarPessoaPorEmail(String email) {
        for (Pessoa p : pessoas)
            for (Contato c : p.getContatos())
                if (c.getTipo().equalsIgnoreCase("email") && c.getValor().equalsIgnoreCase(email))
                    System.out.println(p.getNome());
    }

    public void recuperarPessoaPorTelefone(String telefone) {
        for (Pessoa p : pessoas)
            for (Contato c : p.getContatos())
                if (c.getTipo().equalsIgnoreCase("telefone") && c.getValor().equalsIgnoreCase(telefone))
                    System.out.println(p.getNome());
    }
}
