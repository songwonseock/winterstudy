package poly.clas;

import poly.inter.Angry;
import poly.inter.Eat;
import poly.inter.Human;
import poly.inter.Smile;

public class SoonWoo implements Human{

public void goMan(int a) {
		
		if ( a == 1 ) {
			Smile sm = () -> {System.out.println("�ɼ��챺�� ũ���� ���´�.");};
			sm.smile();
 		} else if ( a == 2 ) {
 			Angry an = () -> {System.out.println("�ɼ��챺�� ȭ���� �汸�� ���� ���׸���.");};
 			an.angry();
 		} else if ( a == 3 ) {
 			Eat eat = () -> {System.out.println("�ɼ��챺�� ���������� �ٸ���� ���� ���� ���´�.");};
 			eat.eat();
 		}
	}
}
