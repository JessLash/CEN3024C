import java.util.Scanner;


public class Fibonacci {

	public static void main(String[] args) {
		
		//basic menu
		System.out.println("Fibonacci Function.");
		System.out.println("Enter what you want to run: ");
		System.out.println("1. Fibonacci recursion.\n");
		System.out.println("2. Fibonacci iteration.\n");
		
		Scanner myObj = new Scanner(System.in);
		int userChoice = myObj.nextInt();
		
		//user selected either recursion or iteration
		if (userChoice == 1) {
			//recursion class
			
			System.out.println("Input integer to calculate.\n");
			Scanner myObj2 = new Scanner(System.in);
			int i = myObj2.nextInt();
			
			long startTime = System.nanoTime();
			System.out.println(Recursion(i));
			
			long endTime = System.nanoTime();			
			long elapsed = endTime - startTime;
			System.out.println(elapsed);
			main(args);
			
		}
		else if (userChoice ==2) {
			//iteration class
			
			System.out.println("Input integer to calculate.\n");
			Scanner myObj2 = new Scanner(System.in);
			int i = myObj2.nextInt();
			
			long startTime = System.nanoTime();
			System.out.println(Iteration(i));
			
			long endTime = System.nanoTime();			
			long elapsed = endTime - startTime;
			System.out.println(elapsed);
			main(args);
		}
		else {
			System.out.println("Error. Enter 1 for recursion and 2 for iteration.");
			main(args);
		}
		
	}
	//Recursive method
	static int Recursion(int n) {
		
			if(n<=1) 
				return n;
		
			return Recursion(n-1) + Recursion(n-2);
					
	}
	
	//iteration method
	static int Iteration(int n) {
		
		if(n <= 1) return 0;
		
		int a = 1;
		int b = 1;
		
		
		for (int i = 2; i < n; i++) {
			
			int c = a;
			a = b + a;
			b = c;
		}
		
		return a;
	}
}



