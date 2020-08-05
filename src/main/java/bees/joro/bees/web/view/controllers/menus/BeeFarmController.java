package bees.joro.bees.web.view.controllers.menus;

import bees.joro.bees.data.models.base.bindings.BeeFarmAddBindingModel;
import bees.joro.bees.services.services.BeeFarmService;
import bees.joro.bees.web.view.models.BeeFarmModel;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;


@Controller
public class BeeFarmController {

    private final BeeFarmService beeFarmService;
    private final ModelMapper modelMapper;

    public BeeFarmController(BeeFarmService beeFarmService, ModelMapper modelMapper) {
        this.beeFarmService = beeFarmService;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/bee_farm")
    public String getBeeFarm() {
        return "other_views/bee_farm.html";
    }

    @PostMapping("/bee_farm")
    public ModelAndView beeFarmConfirm(@Valid @ModelAttribute("beeFarmAddBindingModel")
                                               BeeFarmAddBindingModel beeFarmAddBindingModel,
                                       BindingResult bindingResult, ModelAndView modelAndView) {

        // There are 2 options.
        // Return the user to the same page because there are wrong info
        // Insert the info

        if (bindingResult.hasErrors()) {
            // modelAndView.setViewName("redirect://bee_farm.html");
            modelAndView.setViewName("<h1>There is an error in your logic</h1>");
        } else {

            BeeFarmModel beeFarmModel = this.beeFarmService.registerBeeFarm(this.modelMapper
                    .map(beeFarmAddBindingModel, BeeFarmModel.class));

            modelAndView.setViewName("redirect:/succ_submitted.html");
            //modelAndView.setViewName("<p>Successfully added</p>");
        }

        return modelAndView;
    }

}
