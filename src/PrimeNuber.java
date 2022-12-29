import java.util.Scanner;
public class PrimeNuber {
	static {
		System.out.println("Hi guys here we check our number is prime or NOT");
	}
	static {
		System.out.println("For coade cheking purpose we have Mr.Karansingh ArjunSingh Rajput(Coading Freelicer)");
	}
	public static void getPrimeNumber(int num) {
		int temp=0;
		for ( int i=2;i<=num-1;i++) {
			if(num%i==0) {
				temp=temp+1;
			}
		}
		if(temp==0) {
			System.out.println("Your number is prime ");
		}
		else {
			System.out.println("Your number is not prime ");
		}
		System.out.println("Thank You Karan Sir !");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number here");
		int value = sc.nextInt();
		PrimeNuber.getPrimeNumber(value);
		sc.close();
		
	}

}
