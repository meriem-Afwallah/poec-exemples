package hello;

public class AnimalMain {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.setName("medor");
		d.setAge(2);
		
		Cat c = new Cat();
		c.setName("fido");
		c.setAge(8);
		System.out.println(c.getName()+ ":"+ c.getAge());
		c.makeSound();
				

	}

}
