package zero.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import zero.weather.Memo.Diary;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface DiaryRepository extends JpaRepository<Diary, Integer> {
    List<Diary> findAllByDate(LocalDate date);

    List<Diary> findAllByDateBetween(LocalDate startDate, LocalDate endDate);

    // 수정을 위한 함수
    Diary getFirstByDate(LocalDate date);


    // 다이어리를 지우는 함수
    @Transactional
    void deleteAllByDate(LocalDate date);
}
