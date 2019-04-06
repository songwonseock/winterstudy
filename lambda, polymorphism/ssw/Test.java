package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		String[] arr = new String[]{"E", "B", "A"};
		List<String> list = Arrays.asList(arr);
		Comparator cr = (a, b) -> { return ((String) a).codePointAt(0) - ((String) b).codePointAt(0);};
		Comparator comMethod = cr::compare;
		list.sort((String a, String b) -> { return a.codePointAt(0) - b.codePointAt(0);});
		System.out.println(list);
		List<String> newList = new ArrayList<String>(Arrays.asList(arr));
		newList.add("C");
		newList.sort(comMethod);
		System.out.println(newList);
		//		arrayList.sort((p1, p2) -> {return p1.compareTo(p2));};
		
	}
}
