package anno.regex;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.constraints.Pattern;

/**
 * String ���ڿ��� �����ϱ� ���� �����ϴ� ������̼��Դϴ�.
 * FIELD���� ���𰡴��ϰ� JVM�� ������̼� ������ �����մϴ�.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface OnlyNumber {
	@Pattern(regexp="[0-9]+")
    int value() default 2;
}