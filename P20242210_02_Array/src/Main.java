import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		int[] vint;
		vint = new int[100];
		
		for (int i=0; i<vint.length; i++) {
			vint[i] = i;
			System.out.printf("[%s] %s \n", i, vint[i]);
		}
		for (int i=0; i<vint.length; i++) {
			vint[i] = vint[i] * 2;
			System.out.printf("[%s] %s \n", i, vint[i]);
		}
		for (int i=0; i<vint.length; i++) {
			vint[i] = i;
		}
		for (int i=0; i<vint.length; i++) {
			vint[i] = i*2+1;
			System.out.printf("[%s] %s \n", i, vint[i]);
		}
		for (int i=0; i<vint.length; i++) {
			vint[i] = (2*(i+1))*(2*(i+1));
			System.out.printf("[%s] %s \n", i, vint[i]);
		}
		for (int i=0; i<vint.length; i++) {
			if (i>1) {
				vint[i] = vint[i-1] + vint[i-2];
			}
			else {
				vint[i] = i;
			}
			System.out.printf("[%s] %s \n", i, vint[i]);
		}
		double[] vdou = new double[100];
		for (int i=0; i<vdou.length; i++) {
			vdou[i] = 1.0/(i+1);
			System.out.printf("[%s] %s \n", i, vdou[i]);
		}
		
		for (int i = 0; i < vdou.length; i++) {
			vdou[i] = Math.sin(i*Math.PI*2/360);
		}
		for (int i=0; i<vdou.length; i++) {
			vdou[i] = 1.0/(i+1);
			System.out.printf("[%s] %s \n", i, vdou[i]);
		}
		
		
		

	}

}
