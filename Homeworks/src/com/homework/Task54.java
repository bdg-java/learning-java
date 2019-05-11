public class Task54 {
	public static void main(String[] args){
		int a = 123;
		
		int lastNumber = a % 10;
		int midNumber = a % 100 / 10;
		int firstNumber = a / 100;
		
		int max = lastNumber;
		
		if (midNumber > max)
			max = midNumber;
		if (firstNumber > max)
			max = firstNumber;	
		
		System.out.println(max);
	}
}