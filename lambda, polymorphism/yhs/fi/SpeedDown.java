package lambda.fi;

import lambda.Car;

@FunctionalInterface
public interface SpeedDown {

    void apply(Car v, int speed);
}
