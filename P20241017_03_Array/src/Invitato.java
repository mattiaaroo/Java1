
public class Invitato {
	public String nome;
	private Cibo primo;
	private Cibo secondo;
	private Cibo dolce;
	
	public Cibo getPrimo() {
		return primo;
	}
	public void setPrimo(Cibo primo) {
		this.primo = primo;
	}
	public Cibo getSecondo() {
		return secondo;
	}
	public void setSecondo(Cibo secondo) {
		this.secondo = secondo;
	}
	public Cibo getDolce() {
		return dolce;
	}
	public void setDolce(Cibo dolce) {
		this.dolce = dolce;
	}
	
	public String toString() {
		return this.primo+" "+this.secondo+" "+this.dolce+" ";
	}
	
}
