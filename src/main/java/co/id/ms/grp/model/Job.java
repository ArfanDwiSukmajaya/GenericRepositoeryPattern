package co.id.ms.grp.model;

import co.id.ms.grp.model.baseModel.BaseModel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Job extends BaseModel {
    @Column(nullable = false, length = 35)
    private String title;

    @Column(nullable = false)
    private Integer min_salary;

    @Column(nullable = false)
    private Integer max_salary;

    @OneToMany(mappedBy = "job", cascade = CascadeType.ALL)
    private List<Employee> employees;

    @OneToMany(mappedBy = "job", cascade = CascadeType.ALL)
    private List<History> histories;


}
