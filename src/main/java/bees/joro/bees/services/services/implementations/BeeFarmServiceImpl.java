package bees.joro.bees.services.services.implementations;

import bees.joro.bees.data.models.base.BeeFarm;
import bees.joro.bees.data.models.repositories.BeeFarmRepository;
import bees.joro.bees.services.services.BeeFarmService;
import bees.joro.bees.web.view.models.BeeFarmModel;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BeeFarmServiceImpl implements BeeFarmService {

    private final BeeFarmRepository beeFarmRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public BeeFarmServiceImpl(BeeFarmRepository beeFarmRepository, ModelMapper modelMapper) {
        this.beeFarmRepository = beeFarmRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public BeeFarmModel registerBeeFarm(BeeFarmModel beeFarmModel) {

        BeeFarm beeFarm = this.modelMapper
                .map(beeFarmModel, BeeFarm.class);

        // this.beeFarmRepository.saveAndFlush(beeFarm);

        return this.modelMapper.map(this.beeFarmRepository.saveAndFlush(beeFarm), beeFarmModel.getClass());
    }
}
