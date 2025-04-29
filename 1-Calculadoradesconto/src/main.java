public class main {
    public static void main(String[] args) {
        calculadora calc = new calculadora();
        double preco = 100.0;
        System.out.println("Desconto produto A (10%): " + calc.calcularDesconto(preco, 0.10));
        System.out.println("Desconto produto B (15%): " + calc.calcularDesconto(preco, 0.15));
        System.out.println("Desconto produto C (20%): " + calc.calcularDesconto(preco, 0.20));
    }
}
