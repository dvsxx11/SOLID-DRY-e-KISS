public class calculadoracientifica extends calculadora{
    public double raizQuadrada(double x) {
        if (x < 0) {
            throw new ArithmeticException("Não é possível calcular raiz quadrada");
        }
        return Math.sqrt(x);
    }
    public double potencia (double base, double expoente){
        return Math.pow(base, expoente);
    }
}
