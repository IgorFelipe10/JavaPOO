public class time extends pessoa {
    private int anoFundacao;
    private int titulos;

    public time(String nome, int idade, String posicao, String nacionalidade, int partidas, int gols, String profissao, int anoFundacao, int titulos) {
        super(nome, idade, posicao, nacionalidade, partidas, gols, profissao);
        this.anoFundacao = anoFundacao;
        this.titulos = titulos;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    public int getTitulos() {
        return titulos;
    }

    public void setTitulos(int titulos) {
        this.titulos = titulos;
    }

    @Override
    public String toString() {
        return String.format("%s\nAno de Fundação: %d\nTítulos do Time: %d", super.toString(), anoFundacao, titulos);
    }
}
