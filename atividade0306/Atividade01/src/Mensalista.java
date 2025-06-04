public abstract class Mensalista extends Funcionario {
    private double salario;

    public Mensalista(String nome, String cidade, String estado, int horasTrabalhadas, Departamento departamento) {
        super(nome, cidade, estado, horasTrabalhadas, departamento);
        this.salario = salario;
    }

    @Override
    public double calcularSalario() {
        return salario;
    }
}
