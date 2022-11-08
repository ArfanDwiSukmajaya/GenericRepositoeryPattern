package co.id.ms.grp.controller.generic;

import co.id.ms.grp.controller.generic.impl.ControllerGeneric;
import co.id.ms.grp.model.baseModel.BaseModel;
import co.id.ms.grp.service.generic.ServiceGeneric;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@SuppressWarnings({"unchecked", "rawtypes"})
@ResponseBody
public class ControllerGenericImpl<T extends BaseModel> implements ControllerGeneric<T> {

//    private ServiceGeneric serviceGeneric;
    @Autowired
    private ServiceGeneric<T> serviceGeneric;

    @Override
    @PostMapping
    public ResponseEntity<Object> save(@RequestBody  T model) {
        try{
            return new ResponseEntity(serviceGeneric.save(model), HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity("Erro ao salvar!", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    @GetMapping
    public ResponseEntity<T> findAll() {
        try{
            return new ResponseEntity(serviceGeneric.findAll(), HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity("Gagal menampilkan data!", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Long id) {
        try{
            serviceGeneric.delete(id);
            return new ResponseEntity("Data berhasil di hapus", HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity("Gaggal hapus", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<T> findById(@PathVariable  Long id) {
        try {
            return new ResponseEntity(serviceGeneric.findById(id), HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity("Data tidak ada", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<T> update(T model, Long id) {
         try {
             return new ResponseEntity(serviceGeneric.update(model, id), HttpStatus.OK);
         }catch (Exception e){
             return new ResponseEntity("Data gagal update", HttpStatus.INTERNAL_SERVER_ERROR);
         }
    }


}
