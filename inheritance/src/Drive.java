

public class Drive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car avante = new Avante();
		Car matiz = new Matiz();
		
		drive(avante, "Avante");
		drive(matiz, "Matiz");
	}
	
	public static void drive(Car car, String name) {
		System.out.println(name);
		for (int i = 0; i < 10; i++) {
			car.accelerate();
			System.out.println(i + ":" + car.getSpeed());
		}
	}

}
