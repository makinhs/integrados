package model.data.dao;

import java.util.List;

public interface BaseDAO<T extends Object> {

    public List<T> findAll();

    public T findById(Long id);

    public T save(T entidade);
    
    public void delete(T entidade);
}
