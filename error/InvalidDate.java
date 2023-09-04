package zero.weather.error;

public class InvalidDate extends RuntimeException{
    private static final String MESSAGE = "너무 과거 혹은 미래의 날짜 입니다.";
    public InvalidDate() {
        super(MESSAGE); // 이 예외 클래스가 불릴때 이 MESSAGE 도 같이 반환
    }
}
