package bees.joro.bees.web.view.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ForumController {

    @GetMapping("/forum")
    public String getForum(){
        return "forum/forum.html";
    }
}
