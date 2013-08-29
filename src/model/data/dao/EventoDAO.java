package model.data.dao;

import java.util.List;
import model.data.business.Evento;

public interface EventoDAO extends BaseDAO<Evento>{
    
    public List<Evento> findByNome(String nome);

}
