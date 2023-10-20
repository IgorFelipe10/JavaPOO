import java.util.ArrayList;
import java.util.List;

public class agenda {
    private List<pessoa> contatos;

    public agenda() {
        contatos = new ArrayList<>();  // Inicializa a lista no construtor
    }

    public void adicionarContato(pessoa pessoa) {
        contatos.add(pessoa);
    }

    public pessoa buscarPorNome(String nome) {
        for (pessoa contato : contatos) {
            if (contato.getNome().equals(nome)) {
                return contato;
            }
        }
        return null;
    }

    
    public List<pessoa> buscarPorProfissao(String profissao) {
        List<pessoa> pessoasEncontradas = new ArrayList<>();

        for (pessoa contato : contatos) {
            if (contato.getProfissao().equalsIgnoreCase(profissao)) {
                pessoasEncontradas.add(contato);
            }
        }

        return pessoasEncontradas;
    }
      public void mostrarContatos() {
        System.out.println("Lista de Contatos:");
        for (pessoa contato : contatos) {
            System.out.println(contato.toString());
            System.out.println("-----------");
        }
    }
}

