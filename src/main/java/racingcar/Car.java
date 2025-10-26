package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private static final int MAX_NAME_LENGTH = 5;
    private static final int MOVE_THRESHOLD = 4;

    private final String name;
    private int position = 0;

    public Car(String name){
        validateName(name);
        this.name = name;
    }

    private void validateName(String name) {
        if (name == null || name.trim().isEmpty() || name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException("자동차의 이름은 1자 이상 5자 이하여야 합니다.");
        }
    }

    public void move(int randomNumber){
        if (randomNumber >= MOVE_THRESHOLD){
            position++;
        }
    }

    public String getName(){
        return name;
    }

    public int getPosition(){
        return position;
    }

}
