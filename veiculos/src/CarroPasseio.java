public class CarroPasseio extends Veiculo {
    private Motor motor;
    private String cor;
    private String modelo;

    public CarroPasseio() {
        this(new Motor(), 0, 0, 0.0f, "", "");
    }

    public CarroPasseio(Motor motor, int peso, int velocidadeMaxima, float preco, String cor, String modelo) {
        super(peso, velocidadeMaxima, preco);
        this.motor = motor;
        this.cor = cor;
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setDados(Motor motor, int peso, int velocidadeMaxima, float preco, String cor, String modelo) {
        setMotor(motor);
        setDados(peso, velocidadeMaxima, preco);
        setCor(cor);
        setModelo(modelo);
    }

    public void printDados() {
        System.out.println("--- Carro de Passeio ---");
        motor.printDados();
        super.printDados();
        System.out.println("Cor: " + cor + ", Modelo: " + modelo);
    }
}