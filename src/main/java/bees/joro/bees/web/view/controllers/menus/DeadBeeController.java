package bees.joro.bees.web.view.controllers.menus;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeadBeeController {

    @GetMapping("/deadBees")
    public String getDeadBee(){
        return "other_views/dead_bees.html";
    }
}
