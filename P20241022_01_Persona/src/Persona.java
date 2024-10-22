
public class Persona {
	private String nome;
	private String codFisc;
	private int età;
	
	public Persona(String nome, String codFisc, int età) {
		super();
		this.nome = nome;
		this.codFisc = codFisc;
		this.età = età;
	}
	
	public Persona() {
		super();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodFisc() {
		return codFisc;
	}
	public void setCodFisc(String codFisc) {
		this.codFisc = codFisc;
	}
	public int getEtà() {
		return età;
	}
	public void setEtà(int età) {
		this.età = età;
	}
	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", codFisc=" + codFisc + ", età=" + età + "]";
	}
}
