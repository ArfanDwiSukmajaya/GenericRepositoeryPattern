package co.id.ms.grp.model;


import co.id.ms.grp.model.baseModel.BaseModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.javafaker.Code;
import com.github.javafaker.Name;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "region")
@Getter
@Setter
//@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class Region extends BaseModel {
    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "region", cascade = CascadeType.ALL)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Country> countries;

    public Region(String firstName) {
        this.name = firstName;
    }
}
