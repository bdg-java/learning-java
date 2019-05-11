public class Task53 {
	public static void main(String[] args){
		double a = 123.0;
		double k = 124.0;
		
		double lastNumber = a % 10;
		double midNumber = a % 100 / 10;
		double firstNumber = a / 100;
		double sum = lastNumber + midNumber + firstNumber;
		
		System.out.println(a > k ? a / sum : lastNumber / a);
	}
}