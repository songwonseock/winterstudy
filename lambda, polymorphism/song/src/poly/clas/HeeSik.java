package poly.clas;

import poly.inter.Angry;
import poly.inter.Eat;
import poly.inter.Human;
import poly.inter.Smile;

public class HeeSik implements Human{
	
	public void goMan(int a) {
		
		if ( a == 1 ) {
			Smile sm2 =  Object::new;
			sm2 = () -> {System.out.println("����ı��� ������ ���´�.");};
			sm2.smile();
 		} else if ( a == 2 ) {
 			Angry an = () -> {System.out.println("����ı��� �λ��� ũ�� ���׸��� ħ�� �기��.");};
 			an.angry();
 		} else if ( a == 3 ) {
 			Eat eat = () -> {System.out.println("����ı��� ���� ���� �� ������ ���� �����Ÿ��� �Դ´�.");};
 			eat.eat();
 		}
	}
	
}
