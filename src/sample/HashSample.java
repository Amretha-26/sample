package sample;

public class HashSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Ok";
		StringBuilder sb = new StringBuilder(s);
		System.out.println(s.hashCode() + " " + sb.hashCode());
		String t = new String("Ok");
		StringBuilder tb = new StringBuilder(t);
		System.out.println(t.hashCode() + " " + tb.hashCode());
		if(sb.equals(tb))
		{
			System.out.println("jhduq");
		}

	}

}
