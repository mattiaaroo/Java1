
public class TriangoloRettangolo {
	//Variabili di istanza vanno sempre fatte private!
	private double c1;
	private double c2;
	private double hyp;
	
	/*	Getter e Setter
	*	che possono essere anche creati automaticamente con eclipse
	*/
	
	public double getC1() {
		return c1;
	}

	public void setC1(double c1) {
		this.c1 = c1;
		RicalcolaHyp();
	}

	public double getC2() {
		return c2;
	}

	public void setC2(double c2) {
		this.c2 = c2;
		RicalcolaHyp();
	}

	public double getHyp() {
		return hyp;
	}

	public void setHyp(double hyp) {
		this.hyp = hyp;
	}
	
	// END GETTERs N SETTERs

	public TriangoloRettangolo(double c1, double c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
		RicalcolaHyp();
	}
	
	double Area() {
		return (c1*c2)/2;
	}
	double Perimetro() {
		return c1 + c2 + hyp;
	}
	private void RicalcolaHyp() {
		hyp = Math.sqrt(c1*c1 + c2*c2);
	}
	
}
