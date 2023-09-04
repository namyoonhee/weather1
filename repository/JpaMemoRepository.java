package zero.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zero.weather.Memo.Memo;

@Repository
public interface JpaMemoRepository extends JpaRepository<Memo, Integer> {

}
