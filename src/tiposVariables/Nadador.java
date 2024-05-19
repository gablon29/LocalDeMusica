package tiposVariables;

public class Nadador {
    private String name;
    private String style;

    static int cantid_nad = 0;

    private static String Club = "CAPRI";

    public Nadador(String name, String style) {
        this.name = name;
        this.style = style;
        cantid_nad++;
    }

    public static int numNadadores() {
        return cantid_nad;
    }

    @Override
    public String toString() {
        return "Nadador{" +
                "name='" + name + '\'' +
                ", style='" + style + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public static String getClub() {
        return Club;
    }

    public static void setClub(String club) {
        Club = club;
    }
}
