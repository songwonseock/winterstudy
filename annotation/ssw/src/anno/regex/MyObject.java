package anno.regex;

import anno.StringInjector;

public class MyObject {
	@OnlyCharacter("hello")
    private String name;

    @OnlyNumber
    private int num;

    @StringInjector
    private Integer invalidType;
    
    public MyObject() {
    	System.out.println("constructor name=="+name);
    	System.out.println("constructor num=="+num);
	}
	public String getName() {
        return name;
    }
    public int getNum() {
        return num;
    }
}
