package bees.joro.bees.web.view.controllers.menus;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GoogleMapController {

    @GetMapping("/map")
    public String getMap() {
        return "map";
    }
}
