package sec02_runtime_exception;

class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		changeDog(dog);
		Cat cat = new Cat();
		changeDog(cat);
		
		
	}

	private static void changeDog(Animal animal) {
		// TODO Auto-generated method stub
		if (animal instanceof Dog) {
			Dog dog = (Dog) animal; //ClassCastException
		}

	}

}
