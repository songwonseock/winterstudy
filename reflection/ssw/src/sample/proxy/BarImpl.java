package sample.proxy;

public class BarImpl implements Bar, Say {
	public void hello(int i, String s) {
		System.out.println("   in net.javajigi.oss.proxy.Bar.hello");
	}

	public void goodbye(String str, int i) {
		System.out.println("   in net.javajigi.oss.proxy.Bar.goodbye");
	}

	@Override
	public void sayHi() {
		System.out.println("say hi to everyone");
	}

	@Override
	public void sayGood() {
		System.out.println("say good");
	}
}