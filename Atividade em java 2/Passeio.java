public class Passeio extends Veículo {
    private int qtdPassageiros;

    public Passeio() {
        super("", "", "", "", 0, 0, 0, 0);
        this.qtdPassageiros = 0;
    }

    public Passeio(String placa, String marca, String modelo, String cor, float velocMax, int qtdRodas, int qtdPist, int potencia, int qtdPassageiros) {
        super(placa, marca, modelo, cor, velocMax, qtdRodas, qtdPist, potencia);
        this.qtdPassageiros = qtdPassageiros;
    }

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }
    
      @Override
    public float calcVel() {
        return getVelocMax() * 1000 / 3600;
    }
}
