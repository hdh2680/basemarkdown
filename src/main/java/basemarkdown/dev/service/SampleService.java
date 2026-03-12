package basemarkdown.dev.service;

import basemarkdown.dev.domain.SampleEntity;
import basemarkdown.dev.repository.SampleRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SampleService {

    private final SampleRepository repository;

    public SampleService(SampleRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public SampleEntity save(SampleEntity entity) {
        return repository.save(entity);
    }

    public List<SampleEntity> findAll() {
        return repository.findAll();
    }
}
