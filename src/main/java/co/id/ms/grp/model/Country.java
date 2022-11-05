package co.id.ms.grp.model;

import co.id.ms.grp.model.baseModel.BaseModel;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "country")
@Getter
@Setter
@RequiredArgsConstructor
public class Country extends BaseModel {

    @Column(nullable = false, length = 40)
    private String name;

    @ManyToOne
    private Region region;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
    private List<Location> locations;


}
