/*
     Filename: Greet.java
  Description: Echo greetings to user

      Version: 0.1
      Created: 2014-10-11 13:58:40
  Last-update: 2014-10-11 14:01:37
     Revision: None

       Author: Oxnz
        Email: yunxinyi@gmail.com

Revision history:
	Date Author Remarks
*/

public class Greeter {
	public void greet() {
		System.out.println("Hello, anonymous!");
	}

	public void greet(String username) {
		System.out.println("Hello, " + username);
	}

	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		greeter.greet();
		greeter.greet("John");
	}
}
