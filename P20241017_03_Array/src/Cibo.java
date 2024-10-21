
public class Cibo {
	private String nomePiatto;
	private double peso;
	private double prezzo;
	private double calorie;
	
	public double getCalorie() {
		return calorie;
	}
	public void setCalorie(double calorie) {
		this.calorie = calorie;
	}
	public String getnomePiatto() {
		return nomePiatto;
	}
	public void setnomePiatto(String nomePiatto) {
		this.nomePiatto = nomePiatto;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	public String toString() {
		return this.nomePiatto+" "+this.peso+" "+this.prezzo+" "+this.calorie;
	}
	
}
