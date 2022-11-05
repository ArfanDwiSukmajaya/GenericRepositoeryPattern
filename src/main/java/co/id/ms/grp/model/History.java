package co.id.ms.grp.model;

import co.id.ms.grp.model.baseModel.BaseModel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class History extends BaseModel {

    @Column(nullable = false, columnDefinition = "date null")
    private LocalDate start_date;

    @Column(nullable = false, columnDefinition = "date null")
    private LocalDate end_date;

    @ManyToOne
    private Department department;

    @ManyToOne
    private Employee employee;

    @ManyToOne
    private Job job;

}
