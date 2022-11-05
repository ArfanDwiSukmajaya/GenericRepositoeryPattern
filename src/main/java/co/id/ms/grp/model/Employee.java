package co.id.ms.grp.model;

import co.id.ms.grp.model.baseModel.BaseModel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@RequiredArgsConstructor

public class Employee extends BaseModel {

    @Column(nullable = false, length = 20)
    private String first_name;

    @Column(nullable = false, length = 25)
    private String last_name;

    @Column(nullable = false, length = 25)
    private String email;

    @Column(nullable = false, length = 20)
    private String phone_number;

    @Column(nullable = false, columnDefinition = "date null")
    private LocalDate hire_date;

    @Column(nullable = false)
    private Integer sallary;

    @Column(columnDefinition = "FLOAT(2.2) default null")
    private Float commission_pct;

    @ManyToOne
    @JoinColumn(name = "manager")
    private Employee manager;

    @OneToMany(mappedBy = "manager")
    private List<Employee> employees;



//   Employee to Departmen Many to one
    @ManyToOne
    private Department department;

    @ManyToOne
    private Job job;

//    One to One
    @OneToOne(mappedBy = "manager", cascade = CascadeType.ALL)
    private Department departmentManager;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<History> histories;

}
