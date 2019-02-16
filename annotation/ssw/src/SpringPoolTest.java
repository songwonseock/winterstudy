import java.lang.annotation.ElementType;

public class SpringPoolTest<A> {
	public static void main(String[] args) {
		
		printStringHash("a");
		printStringHash("b");
		printStringHash("a");
		
		
	}

	private static void printStringHash(String str) {
		// TODO Auto-generated method stub
		System.out.println(str.hashCode());
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
}
