import java.util.Scanner;

public class Cicli {

	public static void main(String[] args) {
		for (int i=0; i<10; i++) {
			System.out.println(i);
		}
		
		int i = 0;
		while (i < 10){
			System.out.println(i);
			i++;
		}
		
		for (int j=7; j<77; j+=7) {
			System.out.println(j);
		}
		
		int a = 7;
		while (a < 77){
			System.out.println(a);
			a+=7;
		}
		
		int n = 7;
		boolean res = false;
		if (n % 2 == 0) {
			res = true;
		}
		System.out.println(res);
		
		Scanner read = new Scanner(System.in);
		
		for (i=1; i<=10; i++) {
			System.out.println("Inserisci il numero iteration " + i);
			int j = read.nextInt();
			if (j == 10) {
				System.out.println("Uguale a 10");
			}
			else {
				if (j > 10) {
				System.out.println("Maggiore di 10");
				}
				else {
					if (j < 10) {
						System.out.println("Minore di 10");
					}
				}
			}
		}
	}

}
