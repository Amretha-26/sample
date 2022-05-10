package sample;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class BC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			int a1=2;
			BigInteger b = BigInteger.valueOf(3);
			BigInteger c = BigInteger.valueOf(4);
			//BigInteger a=new BigInteger("2");
			BigInteger d= c.multiply(b.add(BigInteger.valueOf(a1)));
			System.out.println(d);
			int n=10;
			int[] a =new int[n];
		
			/*for(int i=0;i<n;i++)
			{
				a[i]=i;
			}*/
			int z=9;
			Arrays.fill(a,z);
			System.out.println(Arrays.toString(a));
			
		}
	}

