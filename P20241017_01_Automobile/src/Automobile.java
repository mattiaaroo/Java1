
public class Automobile {
	private double cilindrata;
	private double consumo; // litri / 100km
	private double serbatoio;
	private String colore;
	private double prezzo;
	
	public double getCilindrata() {
		return cilindrata;
	}
	public void setCilindrata(double cilindrata) {
		this.cilindrata = cilindrata;
	}
	public double getConsumo() {
		return consumo;
	}
	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
	public double getSerbatoio() {
		return serbatoio;
	}
	public void setSerbatoio(double serbatoio) {
		this.serbatoio = serbatoio;
	}
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	public double litriConsumati(double distanza) {
		double litri = distanza / this.consumo;
		return litri;
	}
	
}
