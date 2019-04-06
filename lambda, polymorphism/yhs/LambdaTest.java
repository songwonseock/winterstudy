package lambda;

import lambda.fi.SpeedDown;
import lambda.fi.SpeedUp;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class LambdaTest {

    public static void main(String[] args) {
        // start, stop
        Consumer<Car> consumer;
        Consumer<FireCar> consumer2;

        // speedUp, speedDown
        SpeedUp speedUp = Car::speedUp;
        SpeedDown speedDown = Car::speedDown;

        // create
//        CreateCar create = (type, name) -> {
//            return new Car(type, name);
//        };

        // constructor
        BiFunction<String, String, Car> newCar = Car::new;

        // 차 생성
        Car car = newCar.apply("자동차", "내 자동차");

        // 차 시동 켬
        consumer = Car::start;
        consumer.accept(car);

        // 차 속도 업
        speedUp.apply(car, 10);

        // 차 속도 감소
        speedDown.apply(car, 1);

        // 차 시동 끔
        consumer = Car::stop;
        consumer.accept(car);

        System.out.println("----------------------------------");

        // create
        BiFunction<String, String, FireCar> newFire = FireCar::new;

        // 차 생성
        FireCar fire = newFire.apply("소방차", "내 소방차");

        // 차 시동 켬
        consumer = Car::start;
        consumer.accept(fire);

        // 차 속도 업
        speedUp.apply(fire, 10);

        // 차 속도 감소
        speedDown.apply(fire, 10);

        // 차 시동 끔
        consumer = Car::stop;
        consumer.accept(fire);

        consumer2 = FireCar::water;
        consumer2.accept(fire);


        System.out.println("----------------------------------");

        // create
//        BiFunction<String, String, Car> car2 = FireCar::new;
//
//        // 차 생성
//        Car fire2 = car2.apply("소방차", "내 소방차");
//
//        FireCar fe3 = (FireCar) fire2;
//        fe3.water();

        //

        //consumer = FireCar::water;
    }
}
