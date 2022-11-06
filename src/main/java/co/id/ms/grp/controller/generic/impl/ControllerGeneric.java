package co.id.ms.grp.controller.generic.impl;

import co.id.ms.grp.model.baseModel.BaseModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface ControllerGeneric <T extends BaseModel> {
    ResponseEntity<Object> save(@RequestBody T model);
    ResponseEntity<T> findAll();
    ResponseEntity<String> delete(@PathVariable Long id);
}
