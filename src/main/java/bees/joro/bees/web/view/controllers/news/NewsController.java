package bees.joro.bees.web.view.controllers.news;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewsController {

    @GetMapping("/news")
    public String getNews() {
        return "news/news.html";
    }
}
