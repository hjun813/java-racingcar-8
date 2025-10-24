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

    @Test
    void 자동차_전진_테스트_4이상(){
        Car car = new Car("hjun");
        car.move(4);
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    void 자동차_전진_테스트_3이하(){
        Car car = new Car("hjun");
        car.move(3);
        assertThat(car.getPosition()).isEqualTo(0);
    }

}
