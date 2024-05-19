package pruebaSQL;

public class Nadadores {
    private String name;

    public Nadadores(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Nadador: {" +
                "Nombre: '" + name + '\'' +
                '}';
    }
}
