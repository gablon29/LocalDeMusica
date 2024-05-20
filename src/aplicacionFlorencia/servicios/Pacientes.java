package aplicacionFlorencia.servicios;

import aplicacionFlorencia.dao.impl.PacienteDaoImp;
import aplicacionFlorencia.dao.interfaces.PacienteDao;
import aplicacionFlorencia.dominio.Paciente;

import java.util.List;

public class Pacientes {

    private final PacienteDao pacienteDao;

    public Pacientes(){
        pacienteDao = new PacienteDaoImp();
    }

    public Paciente getPacinte(int id){
        return pacienteDao.getPaciente(id);
    }
    public List<Paciente> getAllPacientes(){
        return pacienteDao.getAllPaciente();
    }
    public void createPaciente(String name,int age,String patology){
        pacienteDao.cratePaciente(name, age, patology);
    }
}
