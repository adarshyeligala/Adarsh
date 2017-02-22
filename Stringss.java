
public class Stringss {
	public static void main(String[] args) {
		String s1="adarsh";
		String s2="vinay       ";
		String s3="ranga";
		String s4="RANGA";
		System.out.println(s1.charAt(3));
		System.out.println(s1.compareTo( s3));
		System.out.println(s1.compareToIgnoreCase(s4));
		System.out.println(s1.concat(s4));
		System.out.println(s2.trim());
		System.out.println(s1.toUpperCase());
		System.out.println(s4.toLowerCase());
		System.out.println(s1.endsWith("h"));
		System.out.append(s1+s2);
		System.out.println(s1.equals(s4));
	}
}
