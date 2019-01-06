
public class LambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = add(3, 6);
		System.out.println(result);
		
		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Hello world one!");
			}
		};
		
		Runnable r2 = () -> {
			System.out.println("Hello world two!");
			System.out.println("Hello world two two!");
		};
		
		r1.run();
		r2.run();
		
	}

	private static int add(int i, int j) {
		// TODO Auto-generated method stub
		return i + j;
	}


}
