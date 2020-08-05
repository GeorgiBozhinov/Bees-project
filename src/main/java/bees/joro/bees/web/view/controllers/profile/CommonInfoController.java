package bees.joro.bees.web.view.controllers.profile;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommonInfoController {

    @GetMapping("/profile/show")
    public String getCommonInfo(){
        return "profile_files/common_info.html";
    }
}
