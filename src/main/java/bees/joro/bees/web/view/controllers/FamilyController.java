package bees.joro.bees.web.view.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FamilyController {

    @GetMapping("/stolenFamily")
    public String getStolenFamily() {
        return "families/stolen_family.html";
    }
}
