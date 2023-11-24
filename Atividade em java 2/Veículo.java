public abstract class Veículo extends Motor {
    
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private float velocMax;
    private int qtdRodas;

    public Veículo(String placa, String marca, String modelo, String cor, float velocMax, int qtdRodas, int qtdPist, int potencia) {
        super(qtdPist, potencia);
        
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.velocMax = velocMax;
        this.qtdRodas = qtdRodas;
    }

    public abstract float calcVel();
    
    public Motor getMotor() {
        return new Motor(0, 0);
    }
    
    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public String getCor() {
        return cor;
    }

    public float getVelocMax() {
        return velocMax;
    }
    
    public int getQtdRodas() {
        return qtdRodas;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }
 
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public void setVelocMax(float velocMax) {
        this.velocMax = velocMax;
    }
    
    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }
    
    public String obterInformacoes() {
        return "Placa: " + placa +
               "\nMarca: " + marca +
               "\nModelo: " + modelo +
               "\nCor: " + cor +
               "\nVelocidade Máxima: " + velocMax +
               "\nQuantidade de Rodas: " + qtdRodas +
               "\nQuantidade de Pistons: " + getQtdPist() +
               "\nPotência do Motor: " + getPotencia();
    }
}
