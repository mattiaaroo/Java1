
public class Main {

	public static void main(String[] args) {
		/*
		 * Creiamo una classe Cibo con gli attributi che deciderete voi
		 * Creiamo un array di 10 Cibi (che sarebbe il pranzo o la cena)
		 */

//		Cibo[] menu = new Cibo[10];
//		for (int i=0; i<menu.length; i++) {
//			menu[i] = (Cibo)ParseClass.Parse("Cibo");
//		}
		
//		for (int i=0; i<menu.length; i++) {
//		System.out.println(menu[i]);
//		}
//		double sommaCalorie = 0;
//		for (int i = 0; i < menu.length; i++) {
//			sommaCalorie += menu[i].getCalorie();
//		}
//		System.out.println(sommaCalorie);
		
		
		//PRIMI 
		Cibo[] primi = new Cibo[10];
		for (int i=0; i<primi.length; i++) {
			primi[i] = (Cibo)ParseClass.Parse("Cibo");
			System.out.println(primi[i]);
		}
		
		//SECONDI
		Cibo[] secondi = new Cibo[10];
		for (int i=0; i<secondi.length; i++) {
			secondi[i] = (Cibo)ParseClass.Parse("Cibo");
			System.out.println(secondi[i]);
		}
		
		//DOLCI
		Cibo[] dolci = new Cibo[10];
		for (int i=0; i<dolci.length; i++) {
			dolci[i] = (Cibo)ParseClass.Parse("Cibo");
			System.out.println(dolci[i]);
		}
		
		//ISTANZIO LISTA INVITATI E ASSEGNO PORTATE
		Invitato[] invitati = new Invitato[50];
		for (int i = 0; i < invitati.length; i++) {
			invitati[i].nome = "persona " + i;
			int primoN = (int)(Math.random()*primi.length);
			int secondoN = (int)(Math.random()*secondi.length);
			int dolceN = (int)(Math.random()*dolci.length);
			invitati[i].setPrimo(primi[primoN]);
			invitati[i].setSecondo(secondi[secondoN]);
			invitati[i].setDolce(dolci[dolceN]);
		}
		
		//OP INVITATI
		for (int i = 0; i < invitati.length; i++) {
			System.out.println(invitati[i]);
		}
		
		
		//1) Calcolare il numero totale di calorie assunte con questo menu
		//2) Costruire a partire da questo menu un pranzo per 50 persone,
		//   dove ogni portata è composta da tre cibi presi a caso da questo menu
		// Esempio, se menu fosse di 5 elementi, allora una 
		// portata del pranzo per 50 persone
		// sarà composta di tre elementi di menu presi a caso
		/* Difficoltà:
		 * 	Il pranzo di 50 persone è un array di pranzi dove ogni singolo pranzo contiene tre portate. Come fare? 
		 *
		 *Altro esempio
		 *Supponiamo che menu sia composto da (elenco solo i 
		 *nomi delle pietanze, senza indicare calorie o quant'altro,
		 *per semplicità di lettura dell'esempio stesso
		 *	[pasta e ceci, lombata, sogliola, pesce persico, delizia al limone, carciofi, pasta al forno, creme brulee, carbonara]
		 *Io intendo realizzare un pranzo per 50 persone del tipo
		 *persona1		persona2		persona3 ...
		 *pasta e ceci	pasta al forno	carbonara
		 *sogliola		sogliola		lombata
		 *creme brulee	del al limone	carciofi
		 */
	}

}