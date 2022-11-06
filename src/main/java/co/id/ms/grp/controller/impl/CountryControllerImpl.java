package co.id.ms.grp.controller.impl;

import co.id.ms.grp.controller.CountryController;
import co.id.ms.grp.controller.generic.ControllerGenericImpl;
import co.id.ms.grp.model.Country;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/country")
public class CountryControllerImpl extends ControllerGenericImpl<Country> implements CountryController {
}
