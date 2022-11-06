package co.id.ms.grp.service.generic.impl;

import co.id.ms.grp.model.baseModel.BaseModel;
import co.id.ms.grp.repository.generic.GenericRepository;
import co.id.ms.grp.service.generic.ServiceGeneric;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ServiceGenericImpl <T extends BaseModel> implements ServiceGeneric<T> {
    @Autowired
    protected GenericRepository<T> genericRepository;

    @Override
    public List<T> findAll() throws Exception {
        try {
            return genericRepository.findAll();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public T save(T entity) throws Exception {
        try {
            return genericRepository.save(entity);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void delete(Long id) throws Exception {
        try {
            genericRepository.deleteById(id);
        } catch (Exception e) {
            throw e;
        }
    }
}
