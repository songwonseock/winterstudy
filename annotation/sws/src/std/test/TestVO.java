package std.test;

import java.util.Arrays;

import std.com.DefaultMapping;

@DefaultMapping(value = "testValue", age = 250, name = "sws", newNames = { "111", "222" })
public class TestVO {
	int age;
	String name;
	String[] newNames;
	String value;
	
	@Override
	public String toString() {
		return "TestVO [age=" + age + ", name=" + name + ", newNames=" + Arrays.toString(newNames) + ", value=" + value
				+ "]";
	}
}