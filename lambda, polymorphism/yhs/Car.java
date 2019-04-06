package lambda;

public class Car {

    private String type;
    private String name;
    private int speed;

    public Car(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public void start() {
        System.out.println(name + " 시동 켬...");
    }

    public void stop() {
        System.out.println(name + " 시동 끔...");
    }

    public void speedUp(int sp) {
        speed += sp;

        System.out.println(name + " 속도 증가..."+ speed);
    }

    public void speedDown(int sp) {
        speed -= sp;

        if (speed < 0) {
            speed = 0;
        }

        System.out.println(name + " 시동 감소..."+ speed);
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}
