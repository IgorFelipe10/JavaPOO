public class funcionario extends pessoa {
    private int titulos;
    private String ex_clubes;
    private int salario; 
    private String clube;

    public funcionario(String nome, int idade, String posicao, String nacionalidade, int partidas, int gols, String profissao, int titulos, String ex_clubes, int salario, String clube) {
        super(nome, idade, posicao, nacionalidade, partidas, gols, profissao);

        this.titulos = titulos;
        this.ex_clubes = ex_clubes;
        this.salario = salario;
        this.clube = clube;
    }

    public int getTitulos() {
        return titulos;
    }

    public void setTitulos(int titulos) {
        this.titulos = titulos;
    }

    public String getExClubes() {
        return ex_clubes;
    }

    public void setExClubes(String ex_clubes) {
        this.ex_clubes = ex_clubes;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getClube() {
        return clube;
    }

    public void setClube(String clube) {
        this.clube = clube;
    }

    @Override
    public String toString() {
        return String.format("%s\nTítulos: %d\nEx-clubes: %s\nSalário: %.2f\nClube: %s", super.toString(), titulos, ex_clubes, (double) salario / 100, clube);
    }
}
