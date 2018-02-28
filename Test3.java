abstract class Wheeler
{
	abstract void move();
}

class TwoWheeler extends Wheeler {
	void move() {
		System.out.println("it moves");
	}
}

class Test3
{
	public static void main(String[] args) {
		TwoWheeler t=new TwoWheeler();
		t.move();
	}
}


