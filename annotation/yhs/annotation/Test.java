package annotation;

import java.lang.reflect.Field;

@Data(value = "Data")
public class Test {

    private String str1;

    private int int1;

    public Object getter(String fieldName) throws Exception {

        Object result = null;

        Field[] fields = this.getFields();

        if (fields == null) {
            throw new Exception("@Data 어노테이션 필요");
        }

        for (Field field : fields) {
            if (fieldName.equals(field.getName())) {
                field.setAccessible(true);
                result = field.get(this);

                break;
            }
        }

        return result;
    }

    public void setter(String fieldName, Object fieldValue) throws Exception {

        Field[] fields = this.getFields();

        if (fields == null) {
            throw new Exception("@Data 어노테이션 필요");
        }

        for (Field field : fields) {
            if (fieldName.equals(field.getName())) {
                field.setAccessible(true);
                field.set(this, fieldValue);

                break;
            }
        }
    }

    private Field[] getFields() {

        Class testClass = this.getClass();
        Data annotation = (Data) testClass.getAnnotation(Data.class);

        return (annotation != null) ? testClass.getDeclaredFields() : null;
    }
}
