package project47;

import java.util.Arrays;

public class str {
	public static void main(String args[])
	{
		String f=" ";
		String a="Hibro";
		String b=new String ("Hibro");
System.out.println(a);
System.out.println(b);
System.out.println(a==b);
System.out.println(a.equals(b));
System.out.println(a.toLowerCase());
System.out.println(a.toUpperCase());
char c =a.charAt(0);
System.out.println(c);
System.out.println(a.charAt(0));
System.out.println(a);
System.out.println(a.indexOf('i'));
System.out.println(a.lastIndexOf('b'));
System.out.println(a.substring(0,2));
char[] d =a.toCharArray();
System.out.println(a.toCharArray());
System.out.println(d);
System.out.println(a.split("i"));
String[] e=a.split("");
System.out.println(Arrays.toString(e));
System.out.println(a.trim());
System.out.println(f.isEmpty());
System.out.println(f.isBlank());
System.out.println(a.concat("dai"));
System.out.println(a.strip());
System.out.println(a.replace ('i', ' '));
System.out.println(a.replaceAll("Hibro", "vanakam"));
System.out.println(a.replaceAll("(.*)ib(.*)" , "mapla"));
	}
}

