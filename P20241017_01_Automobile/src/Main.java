
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automobile auto = new Automobile();
		auto.setCilindrata((double) 3.2);
		auto.setColore("rosso");
		auto.setConsumo((double) 4.0);
		auto.setPrezzo((double) 25.000);
		auto.setSerbatoio((double) 55.0);
		System.out.println(auto.litriConsumati(100));
	}

}
