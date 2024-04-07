package homework6.dao;

import homework6.domain.TarjetaDebito;

import java.util.List;

public interface TarjetaDebitoDao {

    TarjetaDebito getTarjetaDeDebitoById(int id);
    List<TarjetaDebito> getAllTarjetaDebito();
}
