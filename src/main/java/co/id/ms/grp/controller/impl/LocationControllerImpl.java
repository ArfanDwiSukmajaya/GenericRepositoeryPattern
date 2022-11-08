package co.id.ms.grp.controller.impl;

import co.id.ms.grp.controller.CountryController;
import co.id.ms.grp.controller.LocationController;
import co.id.ms.grp.controller.generic.ControllerGenericImpl;
import co.id.ms.grp.model.Country;
import co.id.ms.grp.model.Location;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/location")
public class LocationControllerImpl extends ControllerGenericImpl<Location> implements LocationController {
}
