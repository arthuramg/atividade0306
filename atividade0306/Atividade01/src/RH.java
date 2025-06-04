import java.util.ArrayList;
import java.util.List;

public class RH {
    private static List<Departamento> departamentos = new ArrayList<>();

    public static void cadastrarDepartamento(Departamento departamento){
        departamentos.add(departamento);
    }

    public static List<Departamento> listarDepartamentos(Departamento departamento) {
        return departamentos;
    }
}
