package co.id.ms.grp.model;


import co.id.ms.grp.model.baseModel.BaseModel;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "region")
@Getter
@Setter
@RequiredArgsConstructor
public class Region extends BaseModel {
    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "region", cascade = CascadeType.ALL)
    private List<Country> countries;
}
