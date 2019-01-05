
public class Avante implements Car {
	int speed;
	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return speed;
	}

	@Override
	public boolean accelerate() {
		// TODO Auto-generated method stub
		speed += 10;
		return false;
	}
	
}
