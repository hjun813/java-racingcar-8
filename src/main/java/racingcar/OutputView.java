package racingcar;

import java.util.List;

public class OutputView {

    public static void printRoundResult(List<Car> cars){
        for(Car car: cars){
            System.out.println(car.getName() + ":" + convertPositionToDash(car.getPosition()));
        }
        System.out.println();
    }

    private static String convertPositionToDash(int position){
        StringBuilder dashes = new StringBuilder();
        for(int i = 0; i < position; i++){
            dashes.append("-");
        }
        return dashes.toString();
    }

    public static void printWinners(List<String> winners){
        String winnersNames = String.join(", " , winners);
        System.out.println("최종 우승자 : " + winnersNames);
    }
}
