package co.id.ms.grp.controller.impl;

import co.id.ms.grp.controller.DepartmentController;
import co.id.ms.grp.controller.LocationController;
import co.id.ms.grp.controller.generic.ControllerGenericImpl;
import co.id.ms.grp.model.Department;
import co.id.ms.grp.model.Location;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/department")
public class DepartmentControllerImpl extends ControllerGenericImpl<Department> implements DepartmentController {
}
