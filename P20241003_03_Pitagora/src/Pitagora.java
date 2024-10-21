
public class Pitagora {

	public static void main(String[] args) {


		//Calcolo dell'ipotenusa di un triangolo rettangolo

		 /*
		 * Sia dato un triangolo rettangolo i cui cateti misurano rispettivamente 10.345 e 20.415 cm
		 * Calcolare
		 * 1) la lunghezza dell'ipotenusa
		 * 2) il perimetro del triangolo rettangolo
		 * 3) L'area del triangolo rettangolo
		 * NB:
		 * a) Teorema di pitagora
		 * dati c1 w c2 cateti di un triangolo rettangolo, l'ipotenusa è la radice quadrata della somma dei quadrati dei cateti
		 * b) In java la rqdica quadrata si calcola con Math.sqrt(numero)
		 */
		double c1 = 10.345;
		double c2 = 20.415;
		double i = Math.sqrt((c1*c1)+(c2*c2));
		double p = c1 + c2 + i;
		double a = (c1 * c2) / 2;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(i);
		System.out.println(p);
		System.out.println(a);

	}

}
