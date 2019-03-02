package sample.reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class UppercaseHandler implements InvocationHandler{

	Hello target;
	public UppercaseHandler(HelloTarget helloTarget) {
		this.target = helloTarget;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		String rtn = (String) method.invoke(target, args);
		return rtn.toUpperCase();
	}

}
