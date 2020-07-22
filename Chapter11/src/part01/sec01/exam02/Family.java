package part01.sec01.exam02;

class Father {
	public void play() {
		System.out.println("father:swimming");
	}

	public void study() {
		System.out.println("father:java programming");
	}
}

class Johnharu extends Father {
	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("Johnharu:# programming");
	}
}

class Gracedew extends Father {
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Gracedew:BaseBall");
	}
}

class Moon extends Father {
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Moon:BasketBall");
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("Moon:visual Basic,visual C++");
	}
}

public class Family {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father daddy=new Father();
		daddy.play();
		daddy.study();
		
		daddy=new Johnharu();
		
		daddy.play();
		daddy.study();
		
		daddy=new Gracedew();
		daddy.play();
		daddy.study();
		
		daddy=new Moon();
		daddy.play();
		daddy.study();
			
	}

}
