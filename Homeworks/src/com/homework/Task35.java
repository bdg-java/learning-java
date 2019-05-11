import java.util.Scanner;

public class Task35 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		
		if (a == b + c + d || b == a + c + d || c == a + b + d || d == a + b + c)
			System.out.println(true);
		else
			System.out.println(false);
	}
}