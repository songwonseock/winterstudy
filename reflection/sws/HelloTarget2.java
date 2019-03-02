package test;

public class HelloTarget2 implements Hello2{
	@Override
	public String sayHello2(String name) {
		return "Hello2 " + name;
	}

	@Override
	public String sayHi2(String name) {
		return "Hi2 " + name;
	}

	@Override
	public String sayThankYou2(String name) {
		return "Thank You2 " + name;
	}
}
