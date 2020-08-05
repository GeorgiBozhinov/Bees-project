package bees.joro.bees.services.services.implementations;

import bees.joro.bees.data.models.base.Project;
import bees.joro.bees.data.models.repositories.ProjectRepository;
import bees.joro.bees.services.services.ProjectService;
import bees.joro.bees.web.view.models.ProjectModel;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public ProjectServiceImpl(ProjectRepository projectRepository, ModelMapper modelMapper) {
        this.projectRepository = projectRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public ProjectModel registerProject(ProjectModel projectModel) {

//        BeeFarm beeFarm = this.modelMapper
//                .map(beeFarmModel, BeeFarm.class);

        Project project = this.modelMapper.map(projectModel, Project.class);

        //return this.modelMapper.map(this.beeFarmRepository.saveAndFlush(beeFarm), beeFarmModel.getClass());
        return this.modelMapper.map(this.projectRepository.saveAndFlush(project), projectModel.getClass());
    }
}
