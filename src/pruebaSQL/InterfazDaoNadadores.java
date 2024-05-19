package pruebaSQL;


import java.util.List;

public interface InterfazDaoNadadores {
    public Nadadores getNadador(int id);
    public List<Nadadores> getAllNadadores();
}
