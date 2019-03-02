package sample.reflection;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Proxy;

import org.junit.Test;

public class TestProxy {

//	@Test
	public void simpleProxy() {
		Hello hello = new HelloTarget();
		assertEquals(hello.sayHello("Toby"), "Hello Toby");
	}
	
//	@Test
	public void helloUppercase() {
		Hello hello = new HelloUppercase(new HelloTarget());
		assertEquals(hello.sayHello("Soonwoo"), "HELLO SOONWOO");
	}
	
//	@Test
	public void createDynamic() {
		Hello proxyHello = (Hello) Proxy.newProxyInstance(Hello.class.getClassLoader(), new Class[] {Hello.class},
				new UppercaseHandler(new HelloTarget()));
		
		assertEquals(proxyHello.sayHello("Soonwoo"), "HELLO SOONWOO");
	}
	
	public static void main(String[] args) {
		SuperHello proxyHello = (SuperHello) Proxy.newProxyInstance(new TestProxy().getClass().getClassLoader(), new Class[] {SuperHello.class},
				new UppercaseHandler2(new HelloTarget2()));
		
//		Hello proxyHello1 = (Hello)   Proxy.newProxyInstance(new TestProxy().getClass().getClassLoader(), new Class[] {Hello2.class},
//				new UppercaseHandler2(new HelloTarget2()));
		
		System.out.println(proxyHello.sayHello("soonwoo"));
	}
//	@Test
	public void create() {
		Hello proxyHello = (Hello) Proxy.newProxyInstance(getClass().getClassLoader(), new Class[] {Hello.class,Hello2.class},
				new UppercaseHandler2(new HelloTarget2()));
		
		System.out.println(proxyHello.sayHello("Soonwoo"));
//		assertEquals(proxyHello.talkHello("Soonwoo"), " SOONWOO");
	}
	
//	@Test
	public void create1() {
		Hello proxyHello = (Hello) Proxy.newProxyInstance(Hello.class.getClassLoader(), new Class[] {Hello.class},
				new UppercaseHandler3(new HelloTarget()));
		
		assertEquals(proxyHello.sayHello("Soonwoo"), "HELLO SOONWOO");
	}
}
