
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona pr = new Persona();
		pr.setNome("Mattia");
		pr.setCognome("Ro'");
		pr.setCodFisc("roxmtp04p05e958c");
		pr.setEtà((byte) 20);
		pr.setTelefono("3338597442");
		pr.setIndirizzo("Via Le Mani Dal Naso, 10");
		System.out.println(pr.getNome());
		System.out.println(pr.getCognome());
		System.out.println(pr.getCodFisc());
		System.out.println(pr.getIndirizzo());
		System.out.println(pr.getEtà());
		System.out.println(pr.getTelefono());
	}

}
