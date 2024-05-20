package aplicacionFlorencia.dao.interfaces;

import aplicacionFlorencia.dominio.Paciente;

import java.util.List;

public interface PacienteDao {
    public Paciente getPaciente(int id);
    public List<Paciente> getAllPaciente();
    public void cratePaciente(String name, int age, String patology);

}
