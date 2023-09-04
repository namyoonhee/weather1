package zero.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zero.weather.Memo.DateWeather;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface DateWeatherRepository extends JpaRepository<DateWeather, LocalDate> {
    // 데이터에 따라서 그 날의 데이터웨더 값을 가져오는 함수 작성
    List<DateWeather> findAllByDate(LocalDate localDate);
}
