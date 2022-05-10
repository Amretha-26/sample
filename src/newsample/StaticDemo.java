package newsample;
import java.util.*;
import java.io.*;
public  class StaticDemo {
	int i=9;
	void display()
	{
		System.out.println(i);
	}
	static class d2{
		static int j=8;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo d = new StaticDemo();
		d.display();
		System.out.println(d2.j);
		StaticDemo.d2 obj = new StaticDemo.d2();
		System.out.println(obj.j);
	}

}
