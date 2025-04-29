public class Caminhao extends Veiculo {
    private Motor motor;
    private int toneladas;
    private int alturaMaxima;
    private int comprimento;

    public Caminhao() {
        this(new Motor(), 0, 0, 0.0f, 0, 0, 0);
    }

    public Caminhao(Motor motor, int peso, int velocidadeMaxima, float preco, int toneladas, int alturaMaxima, int comprimento) {
        super(peso, velocidadeMaxima, preco);
        this.motor = motor;
        this.toneladas = toneladas;
        this.alturaMaxima = alturaMaxima;
        this.comprimento = comprimento;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public int getToneladas() {
        return toneladas;
    }

    public void setToneladas(int toneladas) {
        this.toneladas = toneladas;
    }

    public int getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(int alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public void setDados(Motor motor, int peso, int velocidadeMaxima, float preco, int toneladas, int alturaMaxima, int comprimento) {
        setMotor(motor);
        setDados(peso, velocidadeMaxima, preco);
        setToneladas(toneladas);
        setAlturaMaxima(alturaMaxima);
        setComprimento(comprimento);
    }

    public void printDados() {
        System.out.println("--- Caminhão ---");
        motor.printDados();
        super.printDados();
        System.out.println("Toneladas: " + toneladas + ", Altura Máxima: " + alturaMaxima + " cm, Comprimento: " + comprimento + " cm");
    }
}