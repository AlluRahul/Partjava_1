package Basic_concept;

public class Multoplecalling_InReturnType {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		//int n = test1(5);
		System.out.println(test1(5));
		System.out.println(test2(11.5, 7));
		String s = test3("hello");
		System.out.println(s);
	}

	public static int test1(int a) {
		return a;
	}

	public static double test2(double d, int a) {
		return (d + a);
	}

	public static String test3(String s) {
		return s;
	}
}
