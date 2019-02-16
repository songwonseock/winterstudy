
public class StringFool {

	public void printStr(String a){
		System.out.println("hashcode=="+a.hashCode());
		System.out.println("hashcode=="+a.intern());
	}
}
