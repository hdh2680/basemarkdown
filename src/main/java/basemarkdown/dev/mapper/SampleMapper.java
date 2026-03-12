package basemarkdown.dev.mapper;

import basemarkdown.dev.domain.SampleEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * MyBatis 매퍼 - 복잡한 쿼리/통계용.
 */
@Mapper
public interface SampleMapper {

    List<SampleEntity> selectAll();
}
