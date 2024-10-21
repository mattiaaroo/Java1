
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TriangoloRettangolo tr = new TriangoloRettangolo(1, 2);
		System.out.println(tr.Area());
		
		// tr.c1 = 100; -> NON POSSIBILE CON ATT PRIVATI, quindi -> tr.setC1(100)
		tr.setC1(100);
		System.out.println(tr.Area());
		
		tr.setC1(200);
		System.out.println(tr.Area());
		
		Persona pr = new Persona();
		/*
		pr.nome = "Ciccio";
		System.out.println(pr.nome);
		
		pr.nome = "Andrea";
		System.out.println(pr.nome);
		*/
		
		pr.setNome("Andrea");
		System.out.println(pr.getNome());
		
		pr.setTemp(36);
		System.out.println(pr.getTemp());
		
	}

}
