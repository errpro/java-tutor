/*
     Filename: PrimeNumber.java
  Description: list prime number

      Version: 0.1
      Created: 2014-10-11 14:13:55
  Last-update: 2014-10-11 15:35:47
     Revision: None

       Author: Oxnz
        Email: yunxinyi@gmail.com

Revision history:
	Date Author Remarks
*/

public class PrimeNumber {
	public void list(int begin, int end) {
		int j;
		for (int i = begin; i < end; ++i) {
			for (j = 2; j < i; ++j) {
				if (i % j == 0)
					break;
			}
			if (j == i)
				System.out.println(i);
		}
	}

	public static void main(String[] args) {
		PrimeNumber primeNum = new PrimeNumber();
		primeNum.list(2, 100);
	}
}
