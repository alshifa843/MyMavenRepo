package strings;

public class StringEquals {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "Java";
		String s3 = "JAVA";
		String s4 = "JAVA";
		String s5 = "python";
		System.out.println(s1.equals(s5));
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s5));

	}

}
