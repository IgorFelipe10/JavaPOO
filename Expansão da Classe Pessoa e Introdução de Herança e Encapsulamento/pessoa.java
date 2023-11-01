public class pessoa {
    private String nome;
    private int idade;
    private String posicao;
    private String nacionalidade;
    private int partidas;
    private int gols;
    private String profissao;


    public pessoa(String nome, int idade, String posicao, String nacionalidade, int partidas, int gols, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
        this.nacionalidade = nacionalidade;
        this.partidas = partidas;
        this.gols = gols;
        this.profissao = profissao;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getPosicao() {
        return posicao;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public int getPartidas() {
        return partidas;
    }

    public int getGols() {
        return gols;
    }
    
    public String getProfissao() {
    return profissao;
}

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setPartidas(int partidas) {
        this.partidas = partidas;
    }

    public void setGols(int gols) {
        this.gols = gols;
        
    
    }
        public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    @Override
public String toString() {
    return String.format("Nome: %s\nIdade: %d\nPosição: %s\nNacionalidade: %s\nPartidas: %d\nGols: %d\nProfissão: %s",
            nome, idade, posicao, nacionalidade, partidas, gols, profissao);
}

}
