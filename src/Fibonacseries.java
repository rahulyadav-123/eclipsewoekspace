
public class Fibonacseries {
		public static void main(String[] args) {
			
		int number1 = 0;
		int number2 = 1;
		int sum;
		int number = 10;
		System.out.println(number1);
		for (int i=1; i<number; i++) {
		System.out.println(" " +number2);
		sum = number1 + number2;
		number1 =number2;
		number2 =sum;
		}
		
		}
		
	}



