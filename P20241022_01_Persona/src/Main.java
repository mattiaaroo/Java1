
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		Persona persona1 = new Persona("Mattia", "ROXMTP04P05E958C", 20);
		System.out.println(persona1.equals(persona1));
		System.out.println(persona1);
		
		Modifica(persona1);
		System.out.println(persona1);
	}

	private static void Modifica(Persona persona1) {
		persona1 = new Persona("Paolo", "ROX...", 0);
		//(banalmente)NON CAMBIA NULLA perchè alcuna modifica 
		//è applicata all'oggetto
		//preso in input piuttosto quindi viene
		//creato un nuovo oggetto di Persona
	}

}
