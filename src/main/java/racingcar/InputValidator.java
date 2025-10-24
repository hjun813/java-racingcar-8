package racingcar;

public class InputValidator {
    public static void validateCount(String input){
        try{
            int count = Integer.parseInt(input);
            if(count < 1){
                throw new IllegalArgumentException("시도 횟수는 1 이상이어야 합니다.");
            }
        } catch (NumberFormatException e){
            throw new IllegalArgumentException("시도 횟수가 숫자가 아닙니다.");
        }
    }
}
