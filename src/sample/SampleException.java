package sample;
import java.util.*;
import java.io.*;
public class SampleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String c= null;
			System.out.println(c);
			System.out.println(Integer.parseInt("65",8));
		}
		catch(Exception e)
		{
			System.out.println("error");
		}

	}

}
