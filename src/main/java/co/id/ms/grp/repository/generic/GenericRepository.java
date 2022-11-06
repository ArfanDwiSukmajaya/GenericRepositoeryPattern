package co.id.ms.grp.repository.generic;

import co.id.ms.grp.model.baseModel.BaseModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenericRepository <T extends BaseModel> extends JpaRepository<T, Long> {
}
