package homework6.domain;

public class TarjetaCredito {

    private String number;
    private String titular;

    public TarjetaCredito(String number, String titular) {
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
}
