package bees.joro.bees.web.view.controllers.profile;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SettingsController {

    @GetMapping("/profile/settings")
    public String getSettings() {
        return "profile_files/settings.html";
    }
}
