package lambda.fi;

import lambda.Car;

@FunctionalInterface
public interface SpeedUp {

    void apply(Car v, int speed);
}
