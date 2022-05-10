package sample;
enum day{MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,sunday}
//enum day{1,2,3,4,5}
public class EnumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(day.sunday.ordinal());
		day str[] = day.values();
		for (day i:str)
//		{
//			System.out.println(i);
//		}
		//System.out.println(day.valueOf("TGFD"));
		

	}

}
