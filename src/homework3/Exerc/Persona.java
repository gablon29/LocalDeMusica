package homework3.Exerc;

public class Persona {
    String nombre;
    String edad;
    String hobby;

    TipoPersona trabajo;


    public Persona(String nombre, String edad, String hobby, TipoPersona trabajo) {
        this.nombre = nombre;
        this.edad = edad;
        this.hobby = hobby;
        this.trabajo = trabajo;
    }

    @Override
    public String toString() {
        return "Persona {" +
                "nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                ", hobby='" + hobby + '\'' +
                ", trabajo=" + trabajo +
                '}';
    }
}
