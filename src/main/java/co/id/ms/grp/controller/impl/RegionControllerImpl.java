package co.id.ms.grp.controller.impl;

import co.id.ms.grp.controller.RegionController;
import co.id.ms.grp.controller.generic.ControllerGenericImpl;
import co.id.ms.grp.model.Region;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/region")
public class RegionControllerImpl extends ControllerGenericImpl<Region> implements RegionController {
}
