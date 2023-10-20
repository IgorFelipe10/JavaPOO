
import java.util.List;

public class principal {
    public static void main(String[] args) {
        agenda agenda = new agenda();

        pessoa pessoa1 = new pessoa("Endrick", 17, "Atacante", "Brasileiro", 10, 5, "Jogador");
        pessoa pessoa2 = new pessoa("Gustavo Gomez", 30, "Zagueiro", "Paraguaio", 150, 33, "Jogador");
        
        pessoa jogador = new pessoa("Gabriel Jesus", 29, "Atacante", "Brasileiro", 200, 120, "Jogador");
        System.out.println(jogador.toString());
        
        agenda.adicionarContato(pessoa1);
        agenda.adicionarContato(pessoa2);
        
        System.out.println("----------------------------------------");
        
        pessoa pessoaEncontrada = agenda.buscarPorNome("Gustavo Gomez");
        
        if (pessoaEncontrada != null) {
            System.out.println("Pessoa encontrada:\n" + pessoaEncontrada);
        } else {
            System.out.println("Pessoa não encontrada.");
        }
        
        System.out.println("----------------------------------------");
        
        List<pessoa> jogadoresEncontrados = agenda.buscarPorProfissao("Jogador");

        System.out.println("Jogadores encontrados:");
        for (pessoa jogadorEncontrado : jogadoresEncontrados) {
            System.out.println(jogadorEncontrado);
            
                
            
            agenda.mostrarContatos();
        }
    }
}
