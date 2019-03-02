package sample.proxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TraceProxy implements java.lang.reflect.InvocationHandler {

	private Object obj;

	public static Object newInstance(Object obj) {
		Class[] classes = obj.getClass().getInterfaces();
		for (int i = 0; i < classes.length; i++) {
			System.out.println("name="+i+"=="+classes[0].getName());
		}
		return java.lang.reflect.Proxy.newProxyInstance(obj.getClass()
				.getClassLoader(), obj.getClass().getInterfaces(),
				new TraceProxy(obj));
	}

	private TraceProxy(Object obj) {
		this.obj = obj;
	}

	public Object invoke(Object proxy, Method m, Object[] args)
			throws Throwable {
		Object result;
		try {
			System.out.print("begin method " + m.getName() + "(");
			for (int i = 0; i < args.length; i++) {
				if (i > 0)
					System.out.print(",");
				System.out.print(" " + args[i].toString());
			}
			System.out.println(" )");
			result = m.invoke(obj, args);
		} catch (InvocationTargetException e) {
			throw e.getTargetException();
		} catch (Exception e) {
			throw new RuntimeException("unexpected invocation exception: "
					+ e.getMessage());
		} finally {
			System.out.println("end method " + m.getName());
		}
		return result;
	}
}