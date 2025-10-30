public class MainAgenda {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Pessoa p1 = new Pessoa("Ana");
        Pessoa p2 = new Pessoa("Carlos");

        p1.addContato(new Contato("telefone", "1234-5678"));
        p1.addContato(new Contato("email", "ana@email.com"));
        p2.addContato(new Contato("telefone", "9999-9999"));

        agenda.addPessoa(p1);
        agenda.addPessoa(p2);

        agenda.exibirTodasPessoas();
        System.out.println("\nPessoas com email:");
        agenda.exibirPessoasComEmail();
        System.out.println("\nBuscar pessoa com telefone 9999-9999:");
        agenda.recuperarPessoaPorTelefone("9999-9999");
    }
}
