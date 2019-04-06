package lambda;

public class FireCar extends Car {

    public FireCar(String type, String name) {
        super(type, name);
    }

    public void water() {
        System.out.println("물 뿌리기");
    }

    @Override
    public String toString() {
        return super.toString();
    }

//    public void water(Car car) {
//        water();
//    }
}
