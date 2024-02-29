package bucleFor;

public class Main {
    public static void main(String[] args) {
        int numRefer = 10;
        for (int i = 0; i < numRefer; i++) {
            System.out.println("iteracion Num: " + i);
            for (int j = numRefer; j > i; j--) {
                System.out.println("valor J = " + j);
            }
        }
    }
}
