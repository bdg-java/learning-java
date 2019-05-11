public class Task56 {
	public static void main(String[] args){
		int a = 123;
		
		int lastNumber = a % 10;
		int midNumber = a % 100 / 10;
		int firstNumber = a / 100;
		
		int sum = lastNumber + midNumber + firstNumber;
		
		System.out.println(midNumber > lastNumber ? sum / a : a);
	}
}