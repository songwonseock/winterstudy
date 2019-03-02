package sample.reflection;

public class HelloTarget2 implements Hello2{

	@Override
	public String talkHello(String name) {
		// TODO Auto-generated method stub
		return "talk Hello "+name;
	}

	@Override
	public String talkHi(String name) {
		// TODO Auto-generated method stub
		return "talk Hi "+ name;
	}

	@Override
	public String talkThankyou(String name) {
		// TODO Auto-generated method stub
		return "talk Thankyou "+ name;
	}

}
