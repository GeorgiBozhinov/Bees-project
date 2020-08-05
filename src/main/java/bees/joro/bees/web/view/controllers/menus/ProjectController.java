package bees.joro.bees.web.view.controllers.menus;

import bees.joro.bees.data.models.base.bindings.ProjectBindingModel;
import bees.joro.bees.services.services.ProjectService;
import bees.joro.bees.web.view.models.ProjectModel;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class ProjectController {

    private final ProjectService projectService;
    private final ModelMapper modelMapper;

    public ProjectController(ProjectService projectService, ModelMapper modelMapper) {
        this.projectService = projectService;
        this.modelMapper = modelMapper;
    }

//    public BeeFarmController(BeeFarmService beeFarmService, ModelMapper modelMapper) {
//        this.beeFarmService = beeFarmService;
//        this.modelMapper = modelMapper;
//    }

    @GetMapping("/project")
    public String getProject(){
        return "other_views/project.html";
    }

    @PostMapping("/project")
    public ModelAndView projectConfirm(@Valid @ModelAttribute("projectBindingModel")
                                       ProjectBindingModel projectBindingModel,
                                       BindingResult bindingResult, ModelAndView modelAndView) {

        // There are 2 options.
        // Return the user to the same page because there are wrong info
        // Insert the info

        if (bindingResult.hasErrors()) {
            // modelAndView.setViewName("redirect://bee_farm.html");
            modelAndView.setViewName("<h1>There is an error in your logic</h1>");
        } else {
            ProjectModel projectModel = this.projectService.registerProject(this.modelMapper.
                    map(projectBindingModel, ProjectModel.class));

            modelAndView.setViewName("redirect:/succ_submitted.html");
            //modelAndView.setViewName("<p>Successfully added</p>");
        }
        return modelAndView;
    }
}
