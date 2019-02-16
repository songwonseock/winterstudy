package anno.valid;
import javax.validation.constraints.NotNull;


public class Car {

//    @NotNull
//    @Size(min = 2, max = 14)
    @CheckCase(value = "")
    private String string;

    @NotNull
    @CheckCase(value = "")
    private String number;

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
		MyContextContainer mc = new MyContextContainer();
		
		Car car = mc.get(Car.class);
		System.out.println("num1."+car.getNumber());
		System.out.println("str1."+car.getString());
		
		car.setNumber("123");
		car.setString("Hello world");
		System.out.println("num2."+car.getNumber());
		System.out.println("str2."+car.getString());
		
		car.setNumber("hi everyone");
		car.setString("11123");
		System.out.println("num3."+car.getNumber());
		System.out.println("str3."+car.getString());
		
	}
    
}