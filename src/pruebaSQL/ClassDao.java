package pruebaSQL;


public class ClassDao {

    public String insertar(Persona persona){
        String nuevoRegistro = "INSERT INTO personas.amigos (id, name) " +
                "VALUES " +
                "(" + persona.getId() + ",'" + persona.getName() +"')";
        return nuevoRegistro;
    }

}
