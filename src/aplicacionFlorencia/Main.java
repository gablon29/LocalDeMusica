package aplicacionFlorencia;


import aplicacionFlorencia.dominio.Paciente;
import aplicacionFlorencia.servicios.Pacientes;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pacientes pacientes = new Pacientes();
        List<Paciente> pacientesList = pacientes.getAllPacientes();
        pacientesList.forEach(System.out::println);
    }
}
