
public class strings {
	public static void main(String[] args) {
		String s1="adarsh";
		String s2="vinay";
		String s3="chandu";
		String s4="ranga";
		String s5="adarsh";
		String s6="ADARSH     ";
		String name="hey hi chandu";
		int value=30;
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.charAt(3));
		System.out.println(s1.concat(s2));
		System.out.println(name.contains("hello"));
		System.out.println(name.contains("hey hi chandu"));
		System.out.println(s1.endsWith("t"));
		System.out.println(s1.endsWith("h"));
		System.out.println(s1.equals(s5));
		System.out.println(s1.equalsIgnoreCase(s6));
		System.out.println("String length is:"+ s1.length());
		System.out.println(s1.replace("a", "e"));
		System.out.println(s1.startsWith("a"));
		System.out.println(s1.toUpperCase());
		System.out.println(s6.toLowerCase( ));
		System.out.println(s6.trim());
		System.out.println(value);
	}
}
