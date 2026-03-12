package basemarkdown.dev.controller;

import basemarkdown.dev.domain.SampleEntity;
import basemarkdown.dev.service.SampleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sample")
public class SampleController {

    private final SampleService service;

    public SampleController(SampleService service) {
        this.service = service;
    }

    @GetMapping
    public List<SampleEntity> getAll() {
        return service.findAll();
    }

    @PostMapping
    public SampleEntity create(@RequestBody SampleEntity entity) {
        return service.save(entity);
    }
}
