package racingcar;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class CarTest {
    @Test
    void 자동차_생성(){
        Car car = new Car("hjun");
        assertThat(car.getName()).isEqualTo("hjun");
        assertThat(car.getPosition()).isEqualTo(0);
    }

    @Test
    void  자동차_이름_5글자_초과_예외(){
        assertThatThrownBy(() -> new Car("hyunjun")).isInstanceOf(IllegalAccessException.class);
    }

}
