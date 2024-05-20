package aplicacionFlorencia;


import aplicacionFlorencia.dao.impl.PacienteDaoImp;
import aplicacionFlorencia.dominio.Paciente;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PacienteDaoImp pacienteDaoImp = new PacienteDaoImp();
        List<Paciente> pacientes = pacienteDaoImp.getAllPaciente();
        pacientes.forEach(System.out::println);
    }
}
