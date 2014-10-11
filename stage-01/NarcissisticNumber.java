/*
     Filename: NarcissisticNumber.java
  Description: find Narcissistic number in a range

      Version: 0.1
      Created: 2014-10-11 14:04:15
  Last-update: 2014-10-11 14:09:41
     Revision: None

       Author: Oxnz
        Email: yunxinyi@gmail.com

Revision history:
	Date Author Remarks
*/

public class NarcissisticNumber {
	public void list(int begin, int end) {
		for (int i = begin; i < end; ++i) {
			int a = i/100;
			int b = (i - a*100)/10;
			int c = (i - a*100 - b*10);
			
			if (a*a*a + b*b*b + c*c*c == i) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		NarcissisticNumber narcNum = new NarcissisticNumber();
		narcNum.list(100, 1000);
	}
}
