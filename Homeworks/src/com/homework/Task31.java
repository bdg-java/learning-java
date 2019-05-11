import java.util.Scanner;

public class Task31 {
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		
		int max = a;
		
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		if (d > max)
			max = d;
		
		System.out.printf("The largest number is d", max);
	}
	
}