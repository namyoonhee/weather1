package zero.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableScheduling //  웨더 애플리케이션 안에서 스케줄링 기능을 사용 할수 있겠끔 활성화
public class WeatherApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherApplication.class, args);
		//데이터 웨더 테이블에 하루에 한번씩 날씨를 저장하는 코드 작성

	}

}
