
public class Matiz implements Car {
	int speed;
	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return speed;
	}

	@Override
	public boolean accelerate() {
		// TODO Auto-generated method stub
		speed += 20;
		return false;
	}
	
}
