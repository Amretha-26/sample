package sample;
import java.io.*;
import java.util.*;
public class FileRead {
	public static void main(String[] args)throws IOException
	{
		//InputStreamReader ir =new InputStreamReader(System.in);
		FileReader fr = new FileReader("/home/apnx-desk-03/sample.txt");
		BufferedReader br = new BufferedReader(fr);
		String str = br.readLine();
		System.out.println(str);
		
	}

}
