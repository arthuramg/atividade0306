import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String descricao;
    private double valorHoraTrabalhada;
    private List<Funcionario> funcionarios;

    public Departamento(String descricao, double valorHoraTrabalhada) {
        this.descricao = descricao;
        this.valorHoraTrabalhada = valorHoraTrabalhada;
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public double calcularSalarioTotal() {
        return funcionarios.stream().mapToDouble(Funcionario::calcularSalarioTotal).sum();
    }

    public List<Funcionario> listarFuncionarios (){
        return funcionarios;
    }
}
