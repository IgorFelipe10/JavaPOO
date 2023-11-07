public class Teste {
    public static void main(String[] args) {
        Veículo carro = new Veículo("IMW-1310", "Ferrari", "F8", "Vermelho", 350, 4, 8, 300);
        Veículo carro2 = new Veículo("SCP-1910", "Lamborghini", "Urus", "Roxo", 700, 4, 16, 700);
        Veículo carro3 = new Veículo("SEP-1914", "MCLaren", "Senna", "Laranja", 550, 4, 10, 500);
        Veículo carro4 = new Veículo("SHA-7783", "Porsche", "Cayenne", "Cinza", 100, 4, 4, 300);
        Veículo carro5 = new Veículo("YOD-4000", "Audi", "R8", "Preto", 175, 4, 12, 800);
    
        
        System.out.println("Informações do Carro 1:\n" + carro.obterInformacoes());
        System.out.println("Informações do Carro 2:\n" + carro2.obterInformacoes());
        System.out.println("Informações do Carro 3:\n" + carro3.obterInformacoes());
        System.out.println("Informações do Carro 4:\n" + carro4.obterInformacoes());
        System.out.println("Informações do Carro 5:\n" + carro5.obterInformacoes());
    }
}
