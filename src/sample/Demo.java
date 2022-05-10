package sample;
import java.io.*;
import java.util.*;
 class sDemo {
	static int a=9;
	static void display()
	{
		System.out.println("static method");
	}
	static
	{
		System.out.println("static block");
	}
}
 public class Demo{
	public static void main(String[] args) 
	{
		System.out.println(sDemo.a);
		sDemo.display();
			
	}
}

