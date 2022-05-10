package sample;

public class ST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleThread s = new SampleThread();
		Thread t  = new Thread(s);
		t.start();

	}

}
