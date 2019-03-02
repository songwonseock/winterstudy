package sample.reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class UppercaseHandler2 implements InvocationHandler{

	Object target;
	public UppercaseHandler2(HelloTarget2 helloTarget) {
		this.target = helloTarget;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		String rtn = (String) method.invoke(target, args);
		return rtn.toUpperCase();
	}

}
