package poly.main;

import poly.clas.HeeSik;
import poly.clas.SoonWoo;
import poly.clas.WonSeok;
import poly.inter.Human;

public class Excute {
	public static void main(String[] args) {
		Human human1 = new HeeSik();
		Human human2 = new SoonWoo();
		Human human3 = new WonSeok();
		
		System.out.println("@@@@@@@øÙ¿ª∂ß... ");
		human1.goMan(1);
		human2.goMan(1);
		human3.goMan(1);
		
		System.out.println("@@@@@@@@»≠≥Ø∂ß... ");
		human1.goMan(2);
		human2.goMan(2);
		human3.goMan(2);

		System.out.println("@@@@@@@@π‰∏‘¿ª∂ß... ");
		human1.goMan(3);
		human2.goMan(3);
		human3.goMan(3);
	}
}
