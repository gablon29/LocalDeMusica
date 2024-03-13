package homework1.mc3;

public class Main {
    public static void main(String[] args) {
        Producto prod1 = new Producto("tele", 33.33, "334");
        Producto prod2 = new Producto("lavarropas", 35.44, "323");
        int resul = prod2.compareTo(prod1);
        if (resul > 0) {
            System.out.println("el producto: " + prod2.getNombre() + " es mas caro");
        } else {
            System.out.println("el producto: " + prod1.getNombre() + " es mas caro");
        }
    }
}
