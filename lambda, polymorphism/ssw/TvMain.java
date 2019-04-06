package lambda;

import java.lang.reflect.Method;

public class TvMain {
	public static void main(String[] args) {
		TvLambda lmbda = (a) -> {
//			Method[] ms = Tv.class.getDeclaredMethods();
			Method method;
			try {
				method = Tv.class.getMethod(a);
				method.invoke(Tv.class.newInstance());
			} catch (NoSuchMethodException ie) {
				System.out.println("존재하지 않는 메서드");
			} catch (Exception e) {
				e.printStackTrace();
			}
		};
		
		lmbda.excute("turnOn");
		lmbda.excute("turnOff");
		lmbda.excute("fuckOff");
	}
}
