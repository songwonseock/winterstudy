package anno.regex;

import anno.MyContextContainer;

public class RegExAnnotationDemo {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        // 컨텍스트 컨테이너를 초기화 합니다.
        MyContextContainer demo = new MyContextContainer();

        // MyOjbect 객체를 하나 받아옵니다.
        MyObject obj = demo.get(MyObject.class);

        System.out.println(obj.getName()); // print is "My name is JDM."
        System.out.println(obj.getNum()); // print is "This is StringInjector."
    }
}