package anno;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * String ���ڿ��� �����ϱ� ���� �����ϴ� ������̼��Դϴ�.
 * FIELD���� ���𰡴��ϰ� JVM�� ������̼� ������ �����մϴ�.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface StringInjector {
    String aa() default "This is StringInjector.";
}