package homework4.Exercise;

public class Persona {
    private String name;
    private String lastName;

    public Persona(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
    public void saludar(){
        System.out.println("Hola! " + this.name);
    }
}
