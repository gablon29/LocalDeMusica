package pruebaSQL;

import java.util.List;

public class Nadador {
    private final InterfazDaoNadadores interfazDaoNadadores;

    public Nadador() {
        interfazDaoNadadores = new ClassDaoImpl();
    }

    public Nadadores getNadador(int id) {
        return interfazDaoNadadores.getNadador(id);
    }
    public List<Nadadores> getAllNadador(){
        return interfazDaoNadadores.getAllNadadores();
    }
}
