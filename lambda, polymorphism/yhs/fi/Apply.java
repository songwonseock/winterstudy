package lambda.fi;

import lambda.Car;
import lambda.FireCar;

@FunctionalInterface
public interface Apply {
    FireCar cast(Car car);
}

