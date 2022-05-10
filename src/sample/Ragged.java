package sample;

public class Ragged {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=5;
		int a[][] = new int[r][];
		for(int i=0;i<r;i++)
		{
			 a[i] = new int[i+1];
		}
		int k=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<i+1;j++)
			{
				a[i][j] = k;
				k++;
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<i+1;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println("\n");
		}
	}

}
