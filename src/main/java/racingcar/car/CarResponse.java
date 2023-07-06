package racingcar.car;

public class CarResponse {
    private final String name;
    private final int position;

    public CarResponse(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public static CarResponse of(Car car) {
        return new CarResponse(car.getName(), car.getPosition());
    }

    public String getName() {
        return this.name;
    }

    public int getPosition() {
        return this.position;
    }
}