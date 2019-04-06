package poly.clas;

import poly.inter.Angry;
import poly.inter.Eat;
import poly.inter.Human;
import poly.inter.Smile;

public class HeeSik implements Human{
	
	public void goMan(int a) {
		
		if ( a == 1 ) {
			Smile sm2 =  Object::new;
			sm2 = () -> {System.out.println("유희식군은 아항항 웃는다.");};
			sm2.smile();
 		} else if ( a == 2 ) {
 			Angry an = () -> {System.out.println("유희식군은 인상을 크게 찡그리며 침을 흘린다.");};
 			an.angry();
 		} else if ( a == 3 ) {
 			Eat eat = () -> {System.out.println("유희식군은 밥을 먹을 시 끝까지 혀를 날름거리며 먹는다.");};
 			eat.eat();
 		}
	}
	
}
