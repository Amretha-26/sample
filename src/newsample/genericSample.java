package newsample;
import java.util.*;
import java.io.*;
public class genericSample<T> {
	T i;
	public genericSample()
	{
		i=null;
	}
	public void assign(T num)
	{
		i=num;
		System.out.println(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		genericSample<Integer> s = new genericSample<>();
	//	s.assign(4);

	}

}
