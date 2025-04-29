public class Motor {
    private int numCilindros;
    private int potencia;

    public Motor() {
        this(0, 0);
    }

    public Motor(int numCilindros, int potencia) {
        this.numCilindros = numCilindros;
        this.potencia = potencia;
    }

    public int getNumCilindros() {
        return numCilindros;
    }

    public void setNumCilindros(int numCilindros) {
        this.numCilindros = numCilindros;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setDados(int numCilindros, int potencia) {
        setNumCilindros(numCilindros);
        setPotencia(potencia);
    }

    public void printDados() {
        System.out.println("Motor - Número de Cilindros: " + numCilindros + ", Potência: " + potencia + " CV");
    }
}