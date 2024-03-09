package homework3.streamApiExerc;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("gabriel");
        names.add("lucas");
        names.add("fiorella");

        names.forEach(System.out::println);
        
    }

}
