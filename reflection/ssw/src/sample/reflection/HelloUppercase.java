package sample.reflection;

public class HelloUppercase implements Hello{
	
	Hello hello;
	
	public HelloUppercase(Hello hello) {
		this.hello = hello;
	}

	@Override
	public String sayHello(String name) {
		return hello.sayHello(name).toUpperCase();
	}

	@Override
	public String sayHi(String name) {
		// TODO Auto-generated method stub
		return hello.sayHi(name).toUpperCase();
	}

	@Override
	public String sayThankyou(String name) {
		// TODO Auto-generated method stub
		return hello.sayThankyou(name).toUpperCase();
	}

}
