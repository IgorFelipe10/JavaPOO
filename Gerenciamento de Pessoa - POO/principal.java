public class principal {
 public static void main (String[] args) {
     pessoa pessoa = new pessoa("Endrick", 17, "Atacante");
     
     System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
       System.out.println("Posição: " + pessoa.getPosicao());
        
        pessoa.setNome("Gustavo Gomez");
        pessoa.setIdade(30);
        pessoa.setPosicao("Zagueiro");
        
         System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Posição: " + pessoa.getPosicao());
 }
}
