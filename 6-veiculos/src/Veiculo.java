public class Veiculo {
    private int peso;
    private int velocidadeMaxima;
    private float preco;

    public Veiculo() {
        this(0, 0, 0.0f);
    }

    public Veiculo(int peso, int velocidadeMaxima, float preco) {
        this.peso = peso;
        this.velocidadeMaxima = velocidadeMaxima;
        this.preco = preco;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setDados(int peso, int velocidadeMaxima, float preco) {
        setPeso(peso);
        setVelocidadeMaxima(velocidadeMaxima);
        setPreco(preco);
    }

    public void printDados() {
        System.out.println("Veículo - Peso: " + peso + " kg, Velocidade Máxima: " + velocidadeMaxima + " km/h, Preço: R$ " + preco);
    }
}