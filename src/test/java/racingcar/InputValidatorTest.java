package racingcar;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class InputValidatorTest {

    @Test
    void 시도_횟수_숫자_아님(){
        assertThatThrownBy(() -> InputValidator.validateCount("a"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 시도_횟수_0_이하(){
        assertThatThrownBy(() -> InputValidator.validateCount("0"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
