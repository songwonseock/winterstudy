package anno.regex;

import javax.validation.constraints.Pattern;

import anno.MyContextContainer;

public class PatternClassTest<T> {

	@Pattern(regexp="[a-z]+")
	private T test;

	public T getTest(){
		return test;
	}
	
	public void setTest(T test){
		this.test = test;
	}
	
	public static void main(String[] args) throws IllegalAccessException, InstantiationException {
		MyContextContainer mc = new MyContextContainer();
		
		
		PatternClassTest pt = mc.get(PatternClassTest.class);
		
		pt.setTest("Hello world");
		System.out.println("1."+pt.getTest());
		pt.setTest("123");
		System.out.println("2."+pt.getTest());
		pt.setTest(123);
		System.out.println("3."+pt.getTest());
	}
}
