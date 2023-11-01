public class principal {
    public static void main(String[] args) {
        agenda agenda = new agenda();

   funcionario treinador = new funcionario("José Mourinho", 58, "Treinador", "Português", 300, 0, "Treinador", 10, "Real Madrid", 50000000, "Roma");
time meuTime = new time("Arsenal", 137, "Primeiro", "Ingles", 5000, 3000, "CLube de futebol", 1886, 58);
 pessoa pessoa = new pessoa("Cristiano Ronaldo", 38, "Atacante", "Portugues", 900, 875, "Jogador");
 
agenda.adicionarContato(meuTime.toString());
 agenda.adicionarContato(pessoa.toString());
agenda.adicionarContato(treinador);

        agenda.mostrarContatos();
        }
    }

