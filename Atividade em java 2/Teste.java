public class Teste {
    public static void main(String[] args) {
        Passeio veiculoPasseio1 = new Passeio();
        veiculoPasseio1.setMarca("Toyota");
        veiculoPasseio1.setModelo("Corolla");
        veiculoPasseio1.setPlaca("ABC123");
        veiculoPasseio1.setVelocMax(180);
        veiculoPasseio1.setQtdPassageiros(5);
        veiculoPasseio1.getMotor().setPotencia(150);
        veiculoPasseio1.getMotor().setQtdPist(4);

        Passeio veiculoPasseio2 = new Passeio();
        veiculoPasseio2.setMarca("Honda");
        veiculoPasseio2.setModelo("Civic");
        veiculoPasseio2.setPlaca("XYZ456");
        veiculoPasseio2.setVelocMax(200);
        veiculoPasseio2.setQtdPassageiros(5);
        veiculoPasseio2.getMotor().setPotencia(170);
        veiculoPasseio2.getMotor().setQtdPist(4);

        Passeio veiculoPasseio3 = new Passeio();
        veiculoPasseio3.setMarca("Volkswagen");
        veiculoPasseio3.setModelo("Golf");
        veiculoPasseio3.setPlaca("DEF789");
        veiculoPasseio3.setVelocMax(190);
        veiculoPasseio3.setQtdPassageiros(5);
        veiculoPasseio3.getMotor().setPotencia(160);
        veiculoPasseio3.getMotor().setQtdPist(4);

        Passeio veiculoPasseio4 = new Passeio();
        veiculoPasseio4.setMarca("Ford");
        veiculoPasseio4.setModelo("Focus");
        veiculoPasseio4.setPlaca("GHI012");
        veiculoPasseio4.setVelocMax(185);
        veiculoPasseio4.setQtdPassageiros(5);
        veiculoPasseio4.getMotor().setPotencia(155);
        veiculoPasseio4.getMotor().setQtdPist(4);

        Passeio veiculoPasseio5 = new Passeio();
        veiculoPasseio5.setMarca("Chevrolet");
        veiculoPasseio5.setModelo("Cruze");
        veiculoPasseio5.setPlaca("JKL345");
        veiculoPasseio5.setVelocMax(195);
        veiculoPasseio5.setQtdPassageiros(5);
        veiculoPasseio5.getMotor().setPotencia(165);
        veiculoPasseio5.getMotor().setQtdPist(4);

        System.out.println("Veículo Novo - Informações do Veículo de Passeio 1:");
        System.out.println(veiculoPasseio1.obterInformacoes());

        System.out.println("\nVeículo Novo - Informações do Veículo de Passeio 2:");
        System.out.println(veiculoPasseio2.obterInformacoes());

        System.out.println("\nVeículo Novo - Informações do Veículo de Passeio 3:");
        System.out.println(veiculoPasseio3.obterInformacoes());

        System.out.println("\nVeículo Novo - Informações do Veículo de Passeio 4:");
        System.out.println(veiculoPasseio4.obterInformacoes());

        System.out.println("\nVeículo Novo - Informações do Veículo de Passeio 5:");
        System.out.println(veiculoPasseio5.obterInformacoes());

        Carga veiculoCarga1 = new Carga();
        veiculoCarga1.setMarca("Volvo");
        veiculoCarga1.setModelo("FH16");
        veiculoCarga1.setPlaca("MNO678");
        veiculoCarga1.setVelocMax(80);
        veiculoCarga1.setQtdRodas(18);
        veiculoCarga1.getMotor().setPotencia(600);
        veiculoCarga1.getMotor().setQtdPist(8);
        veiculoCarga1.setCargaMax(40000);
        veiculoCarga1.setTara(12000);

        Carga veiculoCarga2 = new Carga();
        veiculoCarga2.setMarca("Scania");
        veiculoCarga2.setModelo("R620");
        veiculoCarga2.setPlaca("PQR901");
        veiculoCarga2.setVelocMax(85);
        veiculoCarga2.setQtdRodas(18);
        veiculoCarga2.getMotor().setPotencia(650);
        veiculoCarga2.getMotor().setQtdPist(8);
        veiculoCarga2.setCargaMax(45000);
        veiculoCarga2.setTara(13000);

        Carga veiculoCarga3 = new Carga();
        veiculoCarga3.setMarca("Mercedes-Benz");
        veiculoCarga3.setModelo("Actros");
        veiculoCarga3.setPlaca("STU234");
        veiculoCarga3.setVelocMax(75);
        veiculoCarga3.setQtdRodas(16);
        veiculoCarga3.getMotor().setPotencia(550);
        veiculoCarga3.getMotor().setQtdPist(6);
        veiculoCarga3.setCargaMax(35000);
        veiculoCarga3.setTara(11000);
        Carga veiculoCarga4 = new Carga();
        veiculoCarga4.setMarca("Volvo");
        veiculoCarga4.setModelo("FH12");
        veiculoCarga4.setPlaca("YZA890");
        veiculoCarga4.setVelocMax(75);
        veiculoCarga4.setQtdRodas(18);
        veiculoCarga4.getMotor().setPotencia(580);
        veiculoCarga4.getMotor().setQtdPist(8);
        veiculoCarga4.setCargaMax(38000);
        veiculoCarga4.setTara(10000);

        Carga veiculoCarga5 = new Carga();
        veiculoCarga5.setMarca("MAN");
        veiculoCarga5.setModelo("TGX");
        veiculoCarga5.setPlaca("BCD678");
        veiculoCarga5.setVelocMax(82);
        veiculoCarga5.setQtdRodas(18);
        veiculoCarga5.getMotor().setPotencia(620);
        veiculoCarga5.getMotor().setQtdPist(8);
        veiculoCarga5.setCargaMax(42000);
        veiculoCarga5.setTara(13000);

        System.out.println("\nVeículo Novo - Informações do Veículo de Carga 1:");
        System.out.println(veiculoCarga1.obterInformacoes());

        System.out.println("\nVeículo Novo - Informações do Veículo de Carga 2:");
        System.out.println(veiculoCarga2.obterInformacoes());

        System.out.println("\nVeículo Novo - Informações do Veículo de Carga 3:");
        System.out.println(veiculoCarga3.obterInformacoes());

        System.out.println("\nVeículo Novo - Informações do Veículo de Carga 4:");
        System.out.println(veiculoCarga4.obterInformacoes());

        System.out.println("\nVeículo Novo - Informações do Veículo de Carga 5:");
        System.out.println(veiculoCarga5.obterInformacoes());
    }
}
