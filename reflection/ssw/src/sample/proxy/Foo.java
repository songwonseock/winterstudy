
package sample.proxy;

public class Foo {
	public static void main(String[] args) {
//		Bar bar = new BarImpl();
//		bar.hello(2001, "xxx");
//		bar.goodbye("yyy", 2002);
		System.out.println("======================================");
		SuperInt proxy = (SuperInt) TraceProxy.newInstance(new BarImpl());
		proxy.hello(2001, "xxx");
		proxy.goodbye("yyy", 2002);
		proxy.sayGood();
	}
} 