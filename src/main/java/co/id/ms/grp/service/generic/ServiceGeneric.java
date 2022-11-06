package co.id.ms.grp.service.generic;

import co.id.ms.grp.model.baseModel.BaseModel;

import java.util.List;

public interface ServiceGeneric <T extends BaseModel> {
    List<T> findAll() throws Exception;
    T save(T entity) throws Exception;
    void delete(Long id) throws Exception;
    T findById(Long id) throws Exception;
    T update(T entity, Long id) throws Exception;

}
