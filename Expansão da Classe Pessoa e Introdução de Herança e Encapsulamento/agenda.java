import java.util.ArrayList;
import java.util.List;

public class agenda {
    private List<Object> contatos;

    public agenda() {
        contatos = new ArrayList<>();  // Inicializa a lista no construtor
    }

    public void adicionarContato(Object contato) {
        contatos.add(contato);
    }

    public pessoa buscarPorNome(String nome) {
        for (Object contato : contatos) {
            if (contato instanceof pessoa && ((pessoa) contato).getNome().equals(nome)) {
                return (pessoa) contato;
            }
        }
        return null;
    }

    public funcionario buscarFuncionarioPorNome(String nome) {
        for (Object contato : contatos) {
            if (contato instanceof funcionario && ((funcionario) contato).getNome().equals(nome)) {
                return (funcionario) contato;
            }
        }
        return null;
    }

    public List<Object> buscarPorProfissao(String profissao) {
        List<Object> contatosEncontrados = new ArrayList<>();

        for (Object contato : contatos) {
            if (contato instanceof pessoa && ((pessoa) contato).getProfissao().equalsIgnoreCase(profissao)) {
                contatosEncontrados.add(contato);
            } else if (contato instanceof funcionario && ((funcionario) contato).getProfissao().equalsIgnoreCase(profissao)) {
                contatosEncontrados.add(contato);
            }
        }

        return contatosEncontrados;
    }

    public List<funcionario> buscarTreinadorPorClube(String departamento) {
        List<funcionario> funcionariosEncontrados = new ArrayList<>();

        for (Object contato : contatos) {
            if (contato instanceof funcionario && ((funcionario) contato).getClube().equalsIgnoreCase(departamento)) {
                funcionariosEncontrados.add((funcionario) contato);
            }
        }

        return funcionariosEncontrados;
    }

    public double calcularSalarioMedio() {
        if (contatos.isEmpty()) {
            return 0.0;
        }

        double somaSalarios = 0.0;
        int contadorFuncionarios = 0;

        for (Object contato : contatos) {
            if (contato instanceof funcionario) {
                somaSalarios += ((funcionario) contato).getSalario();
                contadorFuncionarios++;
            }
        }

        if (contadorFuncionarios == 0) {
            return 0.0;
        }

        return somaSalarios / contadorFuncionarios;
    }

    public void mostrarContatos() {
        System.out.println("Lista de Contatos:");
        for (Object contato : contatos) {
            System.out.println(contato.toString());
            System.out.println("-----------");
        }
    }
}
    
