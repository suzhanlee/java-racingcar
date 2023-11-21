package racingcar.domain;

import racingcar.dto.GameResultInfo;

public class RacingGame {
    private final RandomService randomService;
    private final RacingCars racingCars;
    private final NumberOfAttempts numberOfAttempts;

    public RacingGame(RandomService randomService, RacingCars racingCars, NumberOfAttempts numberOfAttempts) {
        this.randomService = randomService;
        this.racingCars = racingCars;
        this.numberOfAttempts = numberOfAttempts;
    }

    public GameResultInfo startSingleGame() {
        RacingCars racingCars = this.racingCars.raceOnce(randomService);
        return GameResultInfo.valueOf(racingCars, numberOfAttempts.attempt());
    }
}
