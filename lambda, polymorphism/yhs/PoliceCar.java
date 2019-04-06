package lambda;

public class PoliceCar extends Car {

    public PoliceCar(String type, String name) {
        super(type, name);
    }

    public void siren() {
        System.out.println("사이렌 울리기");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
