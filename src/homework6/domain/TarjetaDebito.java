package homework6.domain;

public class TarjetaDebito {

    private String number;
    private String titular;

    public TarjetaDebito(String number, String titular) {
        this.number = number;
        this.titular = titular;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "TarjetaDebito{" +
                "number='" + number + '\'' +
                ", titular='" + titular + '\'' +
                '}';
    }
}
