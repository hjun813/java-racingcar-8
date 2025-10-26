package racingcar;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        try{
            String carNamesInput = InputView.readCarNames();
            String countInput = InputView.readCount();

            InputValidator.validateCount(countInput);
            int count = Integer.parseInt(countInput);

            RacingGame game = new RacingGame(carNamesInput);

            System.out.println();
            System.out.println("실행 결과");
            for(int i = 0; i< count; i++){
                game.runRound();
                OutputView.printRoundResult(game.getCars());
            }

            List<String> winners = game.findWinners();
            OutputView.printWinners(winners);
        }
        catch (IllegalArgumentException e){
            System.err.println("[오류] " + e.getMessage());
            throw e;
        }
    }
}
