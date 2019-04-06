package poly.clas;

import poly.inter.Angry;
import poly.inter.Eat;
import poly.inter.Human;
import poly.inter.Smile;

public class SoonWoo implements Human{

public void goMan(int a) {
		
		if ( a == 1 ) {
			Smile sm = () -> {System.out.println("심순우군은 크헤헤 웃는다.");};
			sm.smile();
 		} else if ( a == 2 ) {
 			Angry an = () -> {System.out.println("심순우군은 화나면 방구를 끼며 찡그린다.");};
 			an.angry();
 		} else if ( a == 3 ) {
 			Eat eat = () -> {System.out.println("심순우군은 밥을먹을때 다른사람 밥이 눈에 들어온다.");};
 			eat.eat();
 		}
	}
}
