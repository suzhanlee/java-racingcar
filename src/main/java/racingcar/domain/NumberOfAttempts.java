package racingcar.domain;

import static racingcar.constant.Constant.NO_REMAINING_RACES_NUMBER;
import static racingcar.constant.Constant.NUMBER_OF_TRIALS;

import java.util.Objects;

public class NumberOfAttempts {
    public static final String NONE_LEFT_NUMBER_OF_ATTEMPTS_EXCEPTION = "남은 경주 횟수가 0이거나 0보다 작은 경우 경주를 할 수 없습니다.";
    private final long number;

    public NumberOfAttempts(long leftNumberOfAttempts) {
        validateNumberOfAttempts(leftNumberOfAttempts);
        this.number = leftNumberOfAttempts;
    }

    private void validateNumberOfAttempts(long leftNumberOfAttempts) {
        if (isMinus(leftNumberOfAttempts)) {
            throw new IllegalStateException(NONE_LEFT_NUMBER_OF_ATTEMPTS_EXCEPTION);
        }
    }

    private boolean isMinus(long leftNumberOfAttempts) {
        return leftNumberOfAttempts < NO_REMAINING_RACES_NUMBER;
    }

    public NumberOfAttempts attempt() {
        return new NumberOfAttempts(this.number - NUMBER_OF_TRIALS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumberOfAttempts that = (NumberOfAttempts) o;
        return number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
