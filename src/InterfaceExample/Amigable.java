package InterfaceExample;

public class Amigable implements Saludar, Abrazo, Golpe {


    Discupar perdonar = (a, b) -> "me perdonas " + a + " yo no sabia lo que hacia " + b;
    @Override
    public String abrazar(String a) {
        return "Yo te voy a abrazar " + a;
    }
    Despedir saludoDespedia = (a, b) -> "chau " + a + " soy " + b;
    @Override
    public String saludo(String a, String b) {
        return "hola " + a + " soy " + b;
    }

    @Override
    public int golpear(int a, int b) {
        return a * b;
    }

}
