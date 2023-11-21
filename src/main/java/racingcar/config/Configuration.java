package racingcar.config;

import java.util.Random;
import java.util.Scanner;
import racingcar.controller.RacingGameController;
import racingcar.domain.DefaultRandomService;
import racingcar.domain.RacingGame;
import racingcar.domain.RandomService;
import racingcar.service.RacingCarService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Configuration {

    public InputView inputView() {
        return new InputView(scanner());
    }

    private Scanner scanner() {
        return new Scanner(System.in);
    }

    public RacingGameController racingGameController() {
        return new RacingGameController(racingCarService(), outputView());
    }

    private RacingCarService racingCarService() {
        return new RacingCarService(racingGame());
    }

    private RacingGame racingGame() {
        return new RacingGame(randomService());
    }

    private RandomService randomService() {
        return new DefaultRandomService(random());
    }

    private Random random() {
        return new Random();
    }

    private OutputView outputView() {
        return new OutputView();
    }
}
