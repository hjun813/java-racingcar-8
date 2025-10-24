package racingcar;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class RacingGameTest {
    @Test
    void 자동차_생성_테스트(){
        RacingGame game = new RacingGame("pobi,woni,jun");
        assertThat(game.getCars()).hasSize(3);
        assertThat(game.getCars().get(0).getName()).isEqualTo("pobi");
    }

    @Test
    void 우승자_찾기_테스트_1명(){
        RacingGame game = new RacingGame("pobi,woni,jun");
        game.getCars().get(0).move(5);

        List<String> winners = game.findWinners();
        assertThat(winners).containsExactly("pobi");
    }

    @Test
    void 우승자_찾기_테스트_공동(){
        RacingGame game = new RacingGame("pobi,woni,jun");
        game.getCars().get(0).move(5);
        game.getCars().get(2).move(5);

        List<String> winners = game.findWinners();
        assertThat(winners).containsExactly("pobi", "jun");
    }
}
