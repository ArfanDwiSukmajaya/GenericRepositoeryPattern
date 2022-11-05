package co.id.ms.grp.model;

import co.id.ms.grp.model.baseModel.BaseModel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import sun.awt.geom.AreaOp;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "location")
@Getter
@Setter
@RequiredArgsConstructor

public class Location extends BaseModel {

    @Column(nullable = false, length = 40)
    private String street_address;

    @Column(nullable = false, length = 12)
    private String pastal_code;

    @Column(nullable = false, length = 30)
    private String city;

    @Column(nullable = false, length = 25)
    private String state_province;

    @ManyToOne
    private Country country;

    @OneToMany(mappedBy = "location", cascade = CascadeType.ALL)
    private List<Department> departments;

}
