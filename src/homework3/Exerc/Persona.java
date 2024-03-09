package homework3.Exerc;

public class Persona {
    String nombre;
    String edad;
    String hobby;

    public Persona(String nombre, String edad, String hobby) {
        this.nombre = nombre;
        this.edad = edad;
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
