import annotation.Test;

public class Main {
    public static void main(String[] args) throws Exception {

        Test test = new Test();

        System.out.println(test.getter("str1"));
        test.setter("str1", "test");
        System.out.println(test.getter("str1"));

        System.out.println();

        System.out.println(test.getter("int1"));
        test.setter("int1", 100);
        System.out.println(test.getter("int1"));
    }
}