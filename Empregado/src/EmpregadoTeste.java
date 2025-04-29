public class EmpregadoTeste {
    public static void main(String[] args) {
        Empregado emp1 = new Empregado("João", "Silva", 3000.0);
        Empregado emp2 = new Empregado("Maria", "Oliveira", 4500.0);

        SalarioCalculator salarioCalculator = new CalculadoraSalarioAnual();

        System.out.println(emp1.getNome() + " " + emp1.getSobrenome() + " - Salário anual: R$ " + salarioCalculator.calcularSalarioAnual(emp1));
        System.out.println(emp2.getNome() + " " + emp2.getSobrenome() + " - Salário anual: R$ " + salarioCalculator.calcularSalarioAnual(emp2));

        EstrategiaDeAumento aumento10PorCento = new PercentualDeAumento(10);

        aumento10PorCento.aplicarAumento(emp1);
        aumento10PorCento.aplicarAumento(emp2);

        System.out.println("\nApós aumento de 10%:");

        System.out.println(emp1.getNome() + " " + emp1.getSobrenome() + " - Novo salário anual: R$ " + salarioCalculator.calcularSalarioAnual(emp1));
        System.out.println(emp2.getNome() + " " + emp2.getSobrenome() + " - Novo salário anual: R$ " + salarioCalculator.calcularSalarioAnual(emp2));
    }
}