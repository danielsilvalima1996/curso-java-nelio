package devices;

public class ComboDevice extends Device implements Scanner, Printer {

	public ComboDevice(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void print(String doc) {
		System.out.println("Multifuncional imprimindo: " + doc);
	}

	@Override
	public String scan() {
		return "Multifuncional documento digitalizado!";
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Multifuncional digitalizando documento: " + doc);
	}

}
