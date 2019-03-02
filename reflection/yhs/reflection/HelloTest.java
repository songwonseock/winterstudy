package reflection;

import org.junit.Test;

import java.lang.reflect.Proxy;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class HelloTest {

    @Test
    public void simpleTest() {

        Hello hello = new HelloTarget();

        assertThat(hello.sayHello("Toby"), is("Hello Toby"));
        assertThat(hello.sayHi("Toby"), is("Hi Toby"));
        assertThat(hello.sayThankYou("Toby"), is("Thank You Toby"));
    }

    @Test
    public void defaultProxy() {

        Hello proxiedHello = new HelloUppercase(new HelloTarget());

        assertThat(proxiedHello.sayHello("Toby"), is("HELLO TOBY"));
        assertThat(proxiedHello.sayHi("Toby"), is("HI TOBY"));
        assertThat(proxiedHello.sayThankYou("Toby"), is("THANK YOU TOBY"));
    }

    @Test
    public void dynamicProxy() {

        Hello proxiedHello = (Hello) Proxy.newProxyInstance(
            getClass().getClassLoader(),
            new Class[] { Hello.class },
            new UppercaseHandler(new HelloTarget()));

        assertThat(proxiedHello.sayHello("Toby"), is("HELLO TOBY"));
        assertThat(proxiedHello.sayHi("Toby"), is("HI TOBY"));
        assertThat(proxiedHello.sayThankYou("Toby"), is("THANK YOU TOBY"));
    }
}
