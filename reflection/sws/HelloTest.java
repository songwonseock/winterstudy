package test;

import static org.junit.Assert.assertThat;

import java.lang.reflect.Proxy;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class HelloTest {
	
	Class[] clz = new Class[] {Hello.class, Hello2.class};
	ProxyFactory pf = new ProxyFactory();
//	@Test
	public void simpleProxy() {
		Hello hello = new HelloTarget();
		assertThat(hello.sayHello("Toby"), is("Hello Toby"));
		assertThat(hello.sayHi("Toby"), is("Hi Toby"));
		assertThat(hello.sayThankYou("Toby"), is("Thank You Toby"));
	}
	
//	@Test
	public void simpleUppercaseProxy() {
		Hello proxiedHello = new HelloUppercase(new HelloTarget());
		
		assertThat(proxiedHello.sayHello("Toby"), is("HELLO TOBY"));
		assertThat(proxiedHello.sayHi("Toby"), is("HI TOBY"));
		assertThat(proxiedHello.sayThankYou("Toby"), is("THANK YOU TOBY"));
	}
	
	@Test
	public void dynamicProxt1() {
		
		HelloTarget target = new HelloTarget();
		Hello proxiedHello = (Hello) pf.proxyFactory(clz, target);
		
		assertThat(proxiedHello.sayHello("Toby"), is("HELLO TOBY"));
		assertThat(proxiedHello.sayHi("Toby"), is("HI TOBY"));
		assertThat(proxiedHello.sayThankYou("Toby"), is("THANK YOU TOBY"));
	}
	
	@Test
	public void dynamicProxt2() {
		
		HelloTarget2 target = new HelloTarget2();
		Hello2 proxiedHello2 = (Hello2) pf.proxyFactory(clz, target);
		
		assertThat(proxiedHello2.sayHello2("Toby"), is("HELLO2 TOBY"));
		assertThat(proxiedHello2.sayHi2("Toby"), is("HI2 TOBY"));
		assertThat(proxiedHello2.sayThankYou2("Toby"), is("THANK YOU2 TOBY"));
	}
	
//	Hello proxiedHello = (Hello)Proxy.newProxyInstance(
//			getClass().getClassLoader(), 
//			new Class[] {Hello.class}, 
//			new UppercaseHandler(new HelloTarget()));
//	
//	assertThat(proxiedHello.sayHello("Toby"), is("HELLO TOBY"));
//	assertThat(proxiedHello.sayHi("Toby"), is("HI TOBY"));
//	assertThat(proxiedHello.sayThankYou("Toby"), is("THANK YOU TOBY"));
	
//	Hello2 proxiedHello2 = (Hello2)Proxy.newProxyInstance(
//			getClass().getClassLoader(), 
//			new Class[] {Hello2.class}, 
//			new UppercaseHandler(new HelloTarget()));
//	
//	assertThat(proxiedHello2.sayHello2("Toby"), is("HELLO2 TOBY"));
//	assertThat(proxiedHello2.sayHi2("Toby"), is("HI2 TOBY"));
//	assertThat(proxiedHello2.sayThankYou2("Toby"), is("THANK YOU2 TOBY"));
	
}
