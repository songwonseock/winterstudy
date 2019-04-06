package poly.clas;

import poly.inter.Angry;
import poly.inter.Eat;
import poly.inter.Human;
import poly.inter.Smile;

public class WonSeok implements Human{
	public void goMan(int a) {
		
		if ( a == 1 ) {
			Smile sm = () -> {System.out.println("송원석군은 멋있고 스마트하게 웃는다.");};
			sm.smile();
 		} else if ( a == 2 ) {
 			Angry an = () -> {System.out.println("송원석군은 화나면 초사이언으로 변신한다.");};
 			an.angry();
 		} else if ( a == 3 ) {
 			Eat eat = () -> {System.out.println("송원석군은 밥을 먹을 만큼만 먹는다.");};
 			eat.eat();
 		}
		
	}
}
