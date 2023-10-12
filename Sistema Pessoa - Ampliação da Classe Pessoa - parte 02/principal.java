public class principal {
    public static void main(String[] args) {
        pessoa pessoa = new pessoa("Endrick", 17, "Atacante", "Brasileiro", 42, 8);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Posição: " + pessoa.getPosicao());
        System.out.println("Nacionalidade: " + pessoa.getNacionalidade());
        System.out.println("Partidas: " + pessoa.getPartidas());
        System.out.println("Gols: " + pessoa.getGols());

        pessoa.setNome("Gustavo Gomez");
        pessoa.setIdade(30);
        pessoa.setPosicao("Zagueiro");
        pessoa.setNacionalidade("Paraguaio");
        pessoa.setPartidas(300);
        pessoa.setGols(30);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Posição: " + pessoa.getPosicao());
        System.out.println("Nacionalidade: " + pessoa.getNacionalidade());
        System.out.println("Partidas: " + pessoa.getPartidas());
        System.out.println("Gols: " + pessoa.getGols());
    }
}
