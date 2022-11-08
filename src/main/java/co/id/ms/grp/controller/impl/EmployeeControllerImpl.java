package co.id.ms.grp.controller.impl;

import co.id.ms.grp.controller.DepartmentController;
import co.id.ms.grp.controller.EmployeeController;
import co.id.ms.grp.controller.generic.ControllerGenericImpl;
import co.id.ms.grp.model.Department;
import co.id.ms.grp.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeControllerImpl extends ControllerGenericImpl<Employee> implements EmployeeController {
}
