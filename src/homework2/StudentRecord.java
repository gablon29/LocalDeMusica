package homework2;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StudentRecord {
    Map<String, Integer> listaAlumnos = new HashMap<>();

    public void addStudent(String alumno, int calificacion){
        listaAlumnos.put(alumno, calificacion);
    }
    public void removeStudent(String alumno){
        System.out.println("Alumno: " + alumno + "eliminado con exito");
        listaAlumnos.remove(alumno);
    }
    public void getGrade(String alumno) {
        System.out.println(listaAlumnos.get(alumno));
    }
    public void isStudentInRecord(String alumno){
        System.out.println(listaAlumnos.containsKey(alumno));
    }
    public void nuevoLista(){
        System.out.println(listaAlumnos.toString());
    }
}
