/*
     Filename: Test.java
  Description: 

      Version: 0.1
      Created: 2014-10-11 17:56:37
  Last-update: 2014-10-11 18:11:10
     Revision: None

       Author: Oxnz
        Email: yunxinyi@gmail.com

Revision history:
	Date Author Remarks
*/

public class Test {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Animal mammal = new Mammal();
		Dog dog = new Dog("Rocky");
		System.out.println(animal);
		System.out.println(mammal);
		System.out.println(dog);
	}
}
