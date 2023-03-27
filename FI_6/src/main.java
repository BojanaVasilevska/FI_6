import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int k;

		System.out.println("Input k value:");
		k = keyboard.nextInt();
		
		if(k > 6) {
			System.out.println(k);
		}else {
			System.out.println("Not correct value");
		}

	}

}
