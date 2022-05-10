package sample;

public class Method {
	public int b;
	public Method(int x)
	{
		b=x;
	}
    public void display()
    {
    	System.out.println(b);
    }
    public static void triple(int a)
	{
		a=a*3;
		//System.out.println(a);
	}
	public static void change(Method e)
	{
		e.triplechange(6);
	}
	public static void swap(Method a,Method a1)
	{
		/*Method temp = a;
		a=a1;
		a1=temp;*/
		a.b = a.b*2;
		a1.b=a1.b*2;
		System.out.println("inside: "+a.b);
		System.out.println("inside1: "+a1.b);
	}
	public  void triplechange(int p)
	{
		b=p*b;
		//System.out.println(b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
	//	triple(n);
	//	System.out.println(n);
		Method m = new Method(5);
		Method l = new Method(1);
		//change(m);
		swap(m,l);
		m.display();
		l.display();
	}

}
