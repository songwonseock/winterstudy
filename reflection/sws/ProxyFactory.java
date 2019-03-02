package test;

import java.lang.reflect.Proxy;

public class ProxyFactory {
	public Object proxyFactory(Class[] clz, Object target) {
		return Proxy.newProxyInstance(
				getClass().getClassLoader(), 
				clz, 
				new UppercaseHandler(target));
	}
}
