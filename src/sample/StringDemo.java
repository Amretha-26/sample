package sample;
import java.util.*;
import java.io.*;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	String str = "Kim Namjoon is the leader of BTS";
		String s2 = "Today is JHope's bday";
		String s3 = "Today is Jhope's bday";
		System.out.println("1  "+str.length());
		System.out.println("2  "+str.charAt(21));
		System.out.println("3  "+str.toUpperCase());
		System.out.println("4  "+str.toLowerCase());
		System.out.println("5  "+str.trim());
		System.out.println("6  "+str.equals(s2));
		System.out.println("7  "+s2.equals(s3));
		System.out.println("8  "+s2.equalsIgnoreCase(s3));
		System.out.println("9  "+str.substring(11,21));
		System.out.println("0  "+str.compareTo(s3));*/
		StringBuilder bu = new StringBuilder("hi");
		bu.append("welcome");
		System.out.println(bu);	
		String complete = bu.toString();
		System.out.println(complete);
		String name= "ammu";
		String age = "twenty one";
		String message = String.format("Hello, %s. Next year, you'll be %s", name, age);
		System.out.println(message);
	}

}
