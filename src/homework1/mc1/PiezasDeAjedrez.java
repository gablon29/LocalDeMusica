package homework1.mc1;

public class PiezasDeAjedrez {
    private String name;
    private String movement;

    public PiezasDeAjedrez(String name, String movement) {
        this.name = name;
        this.movement = movement;
    }

    @Override
    public String toString() {
        return "Pieza: " + name +
                ", movement= '" + movement + '\'';
    }
}
