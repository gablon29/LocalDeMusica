package homework6.dao;

import homework6.domain.TarjetaCredito;

import java.util.List;

public interface TarjetaCreditoDao {

     TarjetaCredito getTarjetaDeCreditoById(int id);

     List<TarjetaCredito> getAllTarjetaDeCredito();
}
