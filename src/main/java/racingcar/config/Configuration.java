package racingcar.config;

import java.util.Random;
import java.util.Scanner;
import racingcar.controller.RacingGameController;
import racingcar.domain.DefaultRandomService;
import racingcar.domain.RacingGame;
import racingcar.domain.RandomService;
import racingcar.view.Winner;
import racingcar.view.InputView;
import racingcar.view.OutputView;
import racingcar.view.RacingGameResult;

public class Configuration {

    public InputView inputView() {
        return new InputView(scanner());
    }

    private Scanner scanner() {
        return new Scanner(System.in);
    }

    public RacingGameController racingGameController() {
        return new RacingGameController(racingGame(), racingGameResult(), winner(), outputView());
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

    private RacingGameResult racingGameResult() {
        return new RacingGameResult();
    }

    private Winner winner() {
        return new Winner();
    }

    private OutputView outputView() {
        return new OutputView();
    }
}
