package racingcar;

import racingcar.domain.Car;
import racingcar.domain.CarGroup;
import racingcar.domain.Racing;
import racingcar.util.InputView;
import racingcar.util.OutputView;

import java.util.List;
import java.util.Scanner;

public class RacingCarApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playerGroup = InputView.receiveCarNumber(scanner);
        int cycleNumber = InputView.receiveTryNumber(scanner);

        List<Car> cars = Racing.makeCars(playerGroup);
        Racing.runRacing(cars, cycleNumber);

        List<String> winnerNames = CarGroup.extractWinnerNames(cars);
        OutputView.printWinnerNames(winnerNames);
    }
}