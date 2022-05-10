package newsample;
interface i
{
	static void display()
	{
		System.out.println("hi");
	}
}
class inter 
{
	public void display()
	{
		System.out.println("hello");
	}
}
public class NewInterface extends inter implements i{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	i p= new i();
		inter k = new inter();
		k.display();
		i.display();
	}

}
