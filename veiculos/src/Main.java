public class Main {
    public static void main(String[] args) {
        Motor motorCaminhao = new Motor(8, 400);
        Caminhao caminhao = new Caminhao(motorCaminhao, 8000, 120, 350000.0f, 20, 400, 1200);

        Motor motorCarro = new Motor(4, 150);
        CarroPasseio carro = new CarroPasseio(motorCarro, 3000, 220, 75000.0f, "Rosa", "Hilux");

        carro.printDados();
        System.out.println();
        caminhao.printDados();
    }
}