package poly.clas;

import poly.inter.Angry;
import poly.inter.Eat;
import poly.inter.Human;
import poly.inter.Smile;

public class WonSeok implements Human{
	public void goMan(int a) {
		
		if ( a == 1 ) {
			Smile sm = () -> {System.out.println("�ۿ������� ���ְ� ����Ʈ�ϰ� ���´�.");};
			sm.smile();
 		} else if ( a == 2 ) {
 			Angry an = () -> {System.out.println("�ۿ������� ȭ���� �ʻ��̾����� �����Ѵ�.");};
 			an.angry();
 		} else if ( a == 3 ) {
 			Eat eat = () -> {System.out.println("�ۿ������� ���� ���� ��ŭ�� �Դ´�.");};
 			eat.eat();
 		}
		
	}
}
