public class Task52 {
	public static void main(String[] args){
		int a = 123;
		boolean t = true;
		
		int lastNumber = a % 10;
		int midNumber = a % 100 / 10;
		int firstNumber = a / 100;
		
		if (lastNumber == midNumber || lastNumber == firstNumber || midNumber == firstNumber)
			System.out.println(t);
		else {
			t = false;
			System.out.println(t);
		}
	}
}