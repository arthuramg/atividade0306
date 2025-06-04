public abstract class Funcionario {
    private String nome, cidade, estado;
    private int horasTrabalhadas;
    private Departamento departamento;

    public Funcionario(String nome, String cidade, String estado, int horasTrabalhadas, Departamento departamento){
        this.nome = nome;
        this.cidade = cidade;
        this.estado = estado;
        this.horasTrabalhadas = horasTrabalhadas;
        this.departamento = departamento;
    }

    public abstract double calcularSalarioTotal();

}
