package co.id.ms.grp.model;

import co.id.ms.grp.model.baseModel.BaseModel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "department")
@Getter
@Setter
@RequiredArgsConstructor
public class Department extends BaseModel {

    @Column(nullable = false, length = 30)
    private String name;

    @ManyToOne
    private Location location;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List<Employee> employees;

//    one to one
    @OneToOne()
    @JoinColumn(name = "manager")
    private Employee manager;

//    Satu manager(departmen) punya banyak empployee

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List<History> histories;




}
