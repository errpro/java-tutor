/*
     Filename: Dog.java
  Description: 

      Version: 0.1
      Created: 2014-10-11 18:09:25
  Last-update: 2014-10-11 18:12:28
     Revision: None

       Author: Oxnz
        Email: yunxinyi@gmail.com

Revision history:
	Date Author Remarks
*/

public class Dog extends Mammal {
	private String name;

	public Dog(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("%s named %s", super.toString(), name);
	}
}
