package anno.valid;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

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
        	CheckCase annotation = field.getAnnotation(CheckCase.class);
        	System.out.println("ssibal");
        	try {
        		field.setAccessible(true);
        		Integer.parseInt(annotation.value());
                field.set(instance, annotation.value());
			} catch (Exception e) {
				field.set(instance, "error");
			}
//            if( annotation != null && field.getType() == String.class ){
//                
//            }else if( annotation != null && field.getType() == Number.class ){
//                field.setAccessible(true);
//                field.set(instance, 100);
//            }
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