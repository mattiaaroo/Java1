
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] v = new int[100];
//		System.out.println(v[99]);
//		
//		for (int i=0; i<100; i++) {
//			System.out.println(v[i]);
//		}
//		
//		
//		int[] l = {1,2,3,4,5};
//		System.out.println(l[0]);
//		
//		for (int i=0; i<5; i++) {
//			System.out.println(l[i]);
//		}
//		
//		
//		int[] ex = new int[100];
//		
//		for (int j=0; j<100; j++) {
//			ex[j] = j + 1;
//			System.out.println(ex[j]);
//		}
		
		int[] kx = new int[1000];
		int counter = 0;
		int sum = 0;
		int majors = 0;
		int candidate = 1;
		int[] lmajors = new int[1000];
		int[] tempMajors = new int[1000];

		for (int k = 0; k < 1000; k++) {
		    kx[k] = (int) (Math.random() * 100);
		    sum += kx[k];
		    System.out.println(kx[k]);

		    if (kx[k] < 50) {
		        counter += 1;
		    }

		    if (k > 0 && kx[k] > kx[k - 1]) {
		        tempMajors[candidate - 1] = kx[k - 1];
		        candidate += 1;
		        tempMajors[candidate - 1] = kx[k];
		    } else {
		        if (candidate > majors) {
		            majors = candidate;
		            for (int i = 0; i < candidate; i++) {
		                lmajors[i] = tempMajors[i];
		            }
		        }
		        candidate = 1;
		    }
		}

		System.out.printf("La somma dei numeri generati è: %d \n", sum);
		System.out.printf("La media dei numeri generati è: %d \n", sum / kx.length);
		System.out.printf("I numeri minori di cinquanta sui 1000 generati sono: %d \n", counter);
		System.out.printf("La lunghezza della sequenza crescente più lunga è: %d \n", majors);
		System.out.println("La sequenza crescente più lunga è: ");
		for (int i = 0; i < majors; i++) {
		    System.out.println(lmajors[i]);
		}
	}

}
