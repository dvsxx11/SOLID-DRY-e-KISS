public class Main {
    public static void main(String[] args) {
        calculadoracientifica calc = new calculadoracientifica();

        System.out.println("Soma: " + calc.somar(10, 5));
        System.out.println("Subtração: " + calc.subtrair(10, 5));
        System.out.println("Multiplicação: " + calc.multiplicar(10, 5));
        System.out.println("Divisão: " + calc.dividir(10, 5));
        System.out.println("Raiz Quadrada: " + calc.raizQuadrada(16));
        System.out.println("Potência: " + calc.potencia(2, 3));
    }
}
