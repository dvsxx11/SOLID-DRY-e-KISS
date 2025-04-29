public class PercentualDeAumento implements EstrategiaDeAumento {
    private double percentual;

    public PercentualDeAumento(double percentual) {
        this.percentual = percentual;
    }

    @Override
    public void aplicarAumento(Empregado empregado) {
        double aumento = empregado.getSalarioMensal() * (percentual / 100);
        empregado.setSalarioMensal(empregado.getSalarioMensal() + aumento);
    }
}