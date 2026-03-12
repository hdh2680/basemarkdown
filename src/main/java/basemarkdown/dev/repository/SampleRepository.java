package basemarkdown.dev.repository;

import basemarkdown.dev.domain.SampleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleRepository extends JpaRepository<SampleEntity, Long> {
}
