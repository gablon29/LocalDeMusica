package pruebaSQL;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
       try {
           Nadador nadador = new Nadador();
           Nadadores nadadores = nadador.getNadador(2);
           System.out.println(nadadores);
           System.out.println("Traemos todos los nadadores");
           List<Nadadores> nadadores1 = nadador.getAllNadador();
           nadadores1.forEach(System.out::println);
       } catch (Exception e) {
           throw new RuntimeException(e);
       }

    }
}
