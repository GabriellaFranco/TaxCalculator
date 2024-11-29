package entities;

public class JuridicPerson extends Person{
	
	private int workerNumber;
	
	public JuridicPerson() {}

	public JuridicPerson(String name, double anualIncome, int workerNumber) {
		super(name, anualIncome);
		this.workerNumber = workerNumber;
	}

	public int getWorkerNumber() {
		return workerNumber;
	}

	public void setWorkerNumber(int workerNumber) {
		this.workerNumber = workerNumber;
	}

	@Override
	public double calculateTaxes() {
		double fullTaxes = 0;
		if (workerNumber <= 10) {
			fullTaxes = getAnualIncome() * 0.16;
		}
		else {
			fullTaxes = getAnualIncome() * 0.14;
		}
		
		return fullTaxes;
	};
	
	

}
