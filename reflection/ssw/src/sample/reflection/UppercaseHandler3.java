package sample.reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class UppercaseHandler3 implements InvocationHandler{

	Object obj;
	public UppercaseHandler3(HelloTarget helloTarget) {
		this.obj= helloTarget;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object rtn = method.invoke(obj, args);
		if(rtn instanceof String) {
			return ((String) rtn).toUpperCase();
		}
		return rtn;
	}

}
