package com.training.services;

public class StringService {
	
	public void stringEquals(String str1, String str2) {
		
		System.out.println("Is Value Same:"+str1.equals(str2));
		
		System.out.println("Are they pointing to same location:"+(str1==str2));
	}
	
	public void stringObjectEquals() {
		
		String ram = new String("ram");
		
		String ramesh = new String("ramesh");
		
		System.out.println("Is Value Same:"+ ram.equals(ramesh));
		
		System.out.println("Are they pointing to same location:"+(ram==ramesh));
	}
	
	public String usingTrim(String name) {
		
		System.out.println("Without trim:"+name);
		
		System.out.println("Left Trim:"+name.trim());
		
		return name.trim();
	}
	
	public void lengthOfString(String name) {
		
		String resp = usingTrim(name);
		
		System.out.println("String Length:"+name.trim().length());
		
	}
	
	public void usingSubString(String name) {
		
		System.out.println(name.substring(3));
		
		System.out.println(name.substring(0,3));
		
	}
	
	public void usingCharAtAndIndexOf(String name) {
		
		System.out.println("Index position Of @:"+name.indexOf('@'));
		
		System.out.println("Character At Position 3:"+name.charAt(3));
		
	}
	
	public void usingReplace(String str1, String str2) {
		
		System.out.println(str1.replace(".com",".org"));
		
		System.out.println(str2);
	
	}
	
	public void usingContact(String str1, String str2) {
		
		System.out.println(str1.concat(str2));
		
		//StringBuilder is mutable where as String is immutable//
		
		StringBuilder builder = new StringBuilder(str1);
		
		builder.append(str2);
		
		System.out.println(builder.toString());
		
	}
	
	public void usingCompareTo(String str1, String str2) {
		
		System.out.println(str1.compareTo(str2));
		
	}
	
	public void usingStringFormat(String str1, double mark) {
		
		String frmtString = String.format("%S",str1);
		
		System.out.println(frmtString);
		
		System.out.println(String.format("Mark %.2f",mark));
		
	}
	
	public void usingStringFormat(int mark) {
		
		System.out.println(String.format("Octal %o",mark));
		
		System.out.println(String.format("Hexa Decimal %x",mark));

	}
	
	public void usingStringFormat(int mark1, int mark2) {
		
		System.out.println(String.format("Octal%1$o,Hexa %2$x",mark1,mark2));
		
	}
	
	public void usingStringFormat(String str1, String str2) {
		
		System.out.println(String.format("%1$s, %2$s",str1,str2));
	}
	
	public void usingStringFormat(long value) {
		
		System.out.println(String.format("+%d",value));
	}

}
