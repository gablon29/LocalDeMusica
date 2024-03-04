package methodString;

public class Main {
    public static void main(String[] args) {
        String work = "hola mama";
        String work2 = "hola mama";
        char a = work.charAt(1);
        int b = work.compareTo(work2);
        String c = work.concat(work2);
        boolean d = work.contentEquals(work2);
        System.out.println(d);
    }
}
