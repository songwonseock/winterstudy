package reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class UppercaseHandler implements InvocationHandler {

    // Hello target;
    Object target;

    public UppercaseHandler(Hello target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // String ret = (String) method.invoke(target, args);
        // return ret.toUpperCase();

        Object ret = method.invoke(target, args);

        // if (ret instanceof String) {
        if (ret instanceof String && method.getName().startsWith("say")) {
            return ((String) ret).toUpperCase();
        } else {
            return ret;
        }
    }
}
