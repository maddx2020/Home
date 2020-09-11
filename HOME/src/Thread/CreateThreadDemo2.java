package Thread;

public class CreateThreadDemo2 {

	public static void main(String[] args) {

		HelloThread ht = new HelloThread();
		ht.start();
		HelloThread ht1 = new HelloThread();
		ht1.start();
		HelloThread ht2 = new HelloThread();
		ht2.start();
		HelloThread ht3 = new HelloThread();
		ht3.start();

		System.out.println("maiiiiiiiiiiiiiiiiiiiiiiiiiiiiinnnnnnnnn");

	}

}
