package Herencia4;

public class MainAnimal {
	public static void main(String[]args) {
		Animal animal = new Animal("perro");
        Mammal mammal = new Mammal("gato");
        Cat cat = new Cat("Meow");
        Dog dog = new Dog("Woof");

        
        
        System.out.println(animal);
        System.out.println(mammal);
        System.out.println(cat);
        System.out.println(dog);
	}
}
