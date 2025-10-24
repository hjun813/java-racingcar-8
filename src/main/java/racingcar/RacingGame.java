package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.*;
import java.util.stream.Collectors;

public class RacingGame {
    private final List<Car> cars;

    public RacingGame(String carNamesInput){
        String[] carNames = carNamesInput.split(",");
        this.cars = Arrays.stream(carNames)
                .map(String::trim)
                .map(Car::new)
                .collect(Collectors.toList());
    }

    public void runRound(){
        for(Car car : cars){
            int randomNumber = Randoms.pickNumberInRange(0, 9);
            car.move(randomNumber);
        }
    }

    public List<Car> getCars(){
        return cars;
    }

    public List<String> findWinners(){
        int maxPosition =  findMaxPosition();

        return cars.stream()
                .filter(car -> car.getPosition() == maxPosition)
                .map(Car::getName)
                .collect(Collectors.toList());
    }

    public int findMaxPosition(){
        int max = 0;
        for(Car car : cars){
            if(car.getPosition() > max){
                max = car.getPosition();
            }
        }
        return max;
    }
}
