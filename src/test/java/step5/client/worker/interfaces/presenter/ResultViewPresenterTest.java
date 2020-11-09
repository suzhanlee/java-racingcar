package step5.client.worker.interfaces.presenter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import step5.client.worker.domain.*;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ResultViewPresenterTest {
    @DisplayName("시뮬레이션 결과가 비어있지 않은 경우 빈 문자열을 반환하지 않음")
    @Test
    void present_return_not_blank_when_simulationResult_is_not_empty() {
        // given
        final List<Car> cars = Collections.singletonList(Car.of(CarName.of("name"), () -> true));
        final List<RacingGameRoundResult> racingGameRoundResults = Collections.singletonList(RacingGameRoundResult.of(cars));
        final RacingGameResult racingGameResult = new RacingGameResult(racingGameRoundResults, cars);
        final ResultViewPresenter presenter = new ResultViewPresenter();

        // when
        final String result = presenter.present(racingGameResult);

        // then
        assertThat(result).isNotBlank();
    }
}