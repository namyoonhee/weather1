package zero.weather.Memo;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity(name = "date_weather")
@NoArgsConstructor // 컨스트럭터가 필요한데 미리 작성
public class DateWeather {
    // 4개의 컬럼을 잘 인식 할 수 있도록 써준다
    @Id
    private LocalDate date;
    private String weather;
    private String icon;
    private double temperature;

}
// 엔티티 사용하기 위해서 repository 를 하나 만들어야함
