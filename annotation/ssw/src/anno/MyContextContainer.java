package anno;
import java.lang.reflect.Field;

public class MyContextContainer {

    public MyContextContainer(){}

    /**
     * ��ü�� ��ȯ�ϱ� �� ������̼��� �����մϴ�.
     * @param instance
     * @param <T>
     * @return
     * @throws IllegalAccessException
     */
    public <T> T invokeAnnonations(T instance) throws IllegalAccessException {
        Field [] fields = instance.getClass().getDeclaredFields();
        for( Field field : fields ){
            StringInjector annotation = field.getAnnotation(StringInjector.class);
            if( annotation != null && field.getType() == String.class ){
                field.setAccessible(true);
                field.set(instance, annotation.aa());
            }
        }
        return instance;
    }

    /**
     * �Ű������� ���� Ŭ������ ��ü�� ��ȯ�մϴ�.
     * @param clazz
     * @param <T>
     * @return
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public <T> T get(Class clazz) throws IllegalAccessException, InstantiationException {
        T instance = (T) clazz.newInstance();
        instance = invokeAnnonations(instance);
        return instance;
    }
}