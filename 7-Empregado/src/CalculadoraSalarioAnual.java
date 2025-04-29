public class CalculadoraSalarioAnual implements SalarioCalculator {
    @Override
    public double calcularSalarioAnual(Empregado empregado) {
        return empregado.getSalarioMensal() * 12;
}
}