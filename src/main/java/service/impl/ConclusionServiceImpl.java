package service.impl;

import entity.Conclusion;
import org.springframework.beans.factory.annotation.Autowired;
import repository.ConclusionRepository;
import service.ConclusionService;

import java.util.List;

public class ConclusionServiceImpl implements ConclusionService {

    @Autowired
    private ConclusionRepository conclusionRepository;

    @Override
    public Conclusion read(Integer id) {
        return conclusionRepository.findById(id).get();
    }

    @Override
    public List<Conclusion> read() {
        return conclusionRepository.findAll();
    }

    @Override
    public void save(Conclusion entity) {
        conclusionRepository.save(entity);
    }

    @Override
    public void delete(Integer id) {
        conclusionRepository.deleteById(id);
    }
}
